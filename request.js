/*
 * php 调用 0.zone api（信息系统）示例
 */
const axios = require('axios')

axios
  .post('https://0.zone/api/data/', {
    query: '00sec',
    query_type: 'site',
    page: 1,
    pagesize: 10,
    zone_key_id: 'xxxxxx',
  })
  .then((res) => {
    console.log(res.data)
  })
