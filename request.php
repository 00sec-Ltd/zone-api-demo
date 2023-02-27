/*
 * php 调用 0.zone api（信息系统）示例
 */
$ch = curl_init();
$jsonStr = json_encode(array('query' => '00sec', 'query_type' => 'site', 'page' => 1, 'pagesize' => 10, 'zone_key_id' => 'xxxxxx'));

curl_setopt($ch, CURLOPT_POST, 1);
curl_setopt($ch, CURLOPT_URL, 'https://0.zone/api/data/');
curl_setopt($ch, CURLOPT_POSTFIELDS, $jsonStr);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
curl_setopt($ch, CURLOPT_HTTPHEADER, array(
        'Content-Type: application/json;charset=utf8;'
    )
);

$response = curl_exec($ch);
curl_close($ch);
print_r($response);

