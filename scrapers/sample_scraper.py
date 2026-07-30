#!/usr/bin/env python3
"""
Exemplo simples de scraper que gera um JSON de entrada para o motor de cálculo.
Este script não acessa a internet — apenas gera dados de exemplo.
"""
import json
from pathlib import Path

DATA = {
    "modelo": "VW Polo Highline 2024",
    "preco_tabela": 120000.00,
    "ipi": 11.0,
    "icms": 12.0,
    "revisoes": [
        {"km": 10000, "preco": 650.00},
        {"km": 20000, "preco": 890.00},
        {"km": 30000, "preco": 700.00},
        {"km": 40000, "preco": 1200.00},
        {"km": 50000, "preco": 650.00}
    ],
    "pecas": [
        {"item": "Pneu (jogo)", "preco": 2400.00, "quantidade": 1},
        {"item": "Pastilha de freio", "preco": 450.00, "quantidade": 2},
        {"item": "Palheta limpador", "preco": 120.00, "quantidade": 3}
    ]
}

out = Path(__file__).resolve().parents[1] / 'core_engine' / 'input.json'
out.parent.mkdir(parents=True, exist_ok=True)
with out.open('w', encoding='utf-8') as f:
    json.dump(DATA, f, ensure_ascii=False, indent=2)
print(f"Sample input written to {out}")
