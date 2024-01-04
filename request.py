import requests

'''
python 调用 0.zone api（信息系统）示例
'''

data = {
    "query": "零零信安",
    "query_type": "site",
    "page": 1,
    "pagesize": 10,
    "zone_key_id": "xxxxxx"
}

res = requests.post('https://0.zone/api/data/', json=data)

print(res.json())
