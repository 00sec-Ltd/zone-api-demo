/*
 * golang 调用 0.zone api（信息系统）示例
 */
package main
import (
	"bytes"
	"fmt"
	"io/ioutil"
	"net/http"
)
func main() {
	url := "https://0.zone/api/data/"

	var jsonData = []byte(`{
		"query":"00sec",
		"query_type":"site",
		"page":1,
		"pagesize":10,
		"zone_key_id":"xxxxxx"
	}`)
	request, error := http.NewRequest("POST", url, bytes.NewBuffer(jsonData))
	request.Header.Set("Content-Type", "application/json;charset=utf8;")

	client := &http.Client{}
	response, error := client.Do(request)
	if error != nil {
		panic(error)
	}
	defer response.Body.Close()

	body, _ := ioutil.ReadAll(response.Body)
	fmt.Println("response Body:", string(body))
}