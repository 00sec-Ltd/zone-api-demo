# bash 调用 0.zone api（信息系统）示例
curl -X POST https://0.zone/api/data/ -H 'content-type:application/json' -d '{"query":"00sec", "query_type":"site", "page":1, "pagesize":10, "zone_key_id":"xxxxxx"}'