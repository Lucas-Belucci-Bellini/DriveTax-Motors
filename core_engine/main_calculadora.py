#!/usr/bin/env python3
"""
Demo do Motor de Cálculo: lê `input.json`, roda as calculadoras mínimas e escreve `output.json`.
"""
import json
from pathlib import Path
from typing import List, Dict

INPUT = Path(__file__).resolve().parent / 'input.json'
OUTPUT = Path(__file__).resolve().parent / 'output.json'


class CalculadoraDesoneracao:
    def __init__(self, preco_final: float, taxa_ipi_perc: float, taxa_icms_perc: float):
        self.preco_final = float(preco_final)
        self.taxa_ipi = float(taxa_ipi_perc) / 100.0
        self.taxa_icms = float(taxa_icms_perc) / 100.0

    def extrair_preco_real(self) -> Dict:
        preco_fabrica = (self.preco_final * (1 - self.taxa_icms)) / (1 + self.taxa_ipi)
        valor_ipi = preco_fabrica * self.taxa_ipi
        base_icms = preco_fabrica + valor_ipi
        valor_icms = base_icms * self.taxa_icms
        return {
            "preco_tabela": round(self.preco_final, 2),
            "preco_real_fabrica": round(preco_fabrica, 2),
            "impostos": {
                "valor_ipi": round(valor_ipi, 2),
                "valor_icms": round(valor_icms, 2),
                "total_impostos": round(valor_ipi + valor_icms, 2)
            }
        }


class CalculadoraManutencao:
    def __init__(self, revisoes: List[Dict], pecas: List[Dict], km_por_ano: int = 15000, anos_uso: int = 3):
        self.revisoes = revisoes or []
        self.pecas = pecas or []
        self.km_total_projetado = km_por_ano * anos_uso

    def projetar_custos(self) -> Dict:
        custo_revisoes = sum(rev.get('preco', 0) for rev in self.revisoes if rev.get('km', 0) <= self.km_total_projetado)
        custo_pecas = sum(p.get('preco', 0) * p.get('quantidade', 1) for p in self.pecas)
        custo_total = custo_revisoes + custo_pecas
        custo_por_km = custo_total / self.km_total_projetado if self.km_total_projetado else 0
        return {
            "projecao_anos": 3,
            "km_total_projetado": self.km_total_projetado,
            "gastos": {
                "total_revisoes": round(custo_revisoes, 2),
                "total_pecas": round(custo_pecas, 2),
                "custo_manutencao_total": round(custo_total, 2)
            },
            "indicadores": {
                "custo_manutencao_por_km": round(custo_por_km, 3)
            }
        }


def main():
    if not INPUT.exists():
        print(f"Input not found: {INPUT}. Run `scrapers/sample_scraper.py` to create sample input.")
        return

    data = json.loads(INPUT.read_text(encoding='utf-8'))

    calc_impostos = CalculadoraDesoneracao(data.get('preco_tabela', 0), data.get('ipi', 0), data.get('icms', 0))
    resultado_preco = calc_impostos.extrair_preco_real()

    calc_manut = CalculadoraManutencao(data.get('revisoes', []), data.get('pecas', []))
    resultado_manut = calc_manut.projetar_custos()

    agregado = {
        "modelo": data.get('modelo'),
        "aquisicao": resultado_preco,
        "pos_venda": resultado_manut,
        "custo_real_3_anos": round(resultado_preco.get('preco_tabela', 0) + resultado_manut['gastos']['custo_manutencao_total'], 2)
    }

    OUTPUT.write_text(json.dumps(agregado, ensure_ascii=False, indent=2), encoding='utf-8')
    print(f"Output written to {OUTPUT}")


if __name__ == '__main__':
    main()
