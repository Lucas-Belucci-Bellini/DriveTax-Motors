#!/usr/bin/env python3
"""
Validador simples que garante campos mínimos no JSON de entrada.
"""
from typing import Dict

REQUIRED = ['modelo', 'preco_tabela', 'ipi', 'icms']

def validate_input(data: Dict) -> Dict:
    missing = [k for k in REQUIRED if k not in data]
    return {
        'valid': len(missing) == 0,
        'missing': missing
    }
