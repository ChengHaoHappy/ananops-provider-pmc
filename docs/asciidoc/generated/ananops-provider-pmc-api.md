# ananops-provider-pmc


<a name="overview"></a>
## 概览
created by ChengHao


### 版本信息
*版本* : 1.0


### 联系方式
*名字* : ChengHao  
*邮箱* : ananops.net@gmail.com


### 许可信息
*许可证* : Apache License 2.0  
*许可网址* : http://www.apache.org/licenses/LICENSE-2.0  
*服务条款* : null


### URI scheme
*域名* : 127.0.0.1:8300  
*基础路径* : /


### 标签

* pmc-contract-controller : Pmc Contract Controller
* pmc-inspect-device-controller : Pmc Inspect Device Controller
* pmc-project-controller : Pmc Project Controller




<a name="paths"></a>
## 资源

<a name="pmc-contract-controller_resource"></a>
### Pmc-contract-controller
Pmc Contract Controller


<a name="deletecontractbyidusingpost"></a>
#### 根据合同id删除合同
```
POST /contract/deleteContractById/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Wrapper](#wrapper)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/contract/deleteContractById/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "message" : "string",
  "result" : "object"
}
```


<a name="getcontactlistbygroupidusingpost"></a>
#### 获取某个组织的合同列表
```
POST /contract/getContactListByGroupId/{groupId}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**groupId**  <br>*可选*|组织|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Wrapper](#wrapper)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/contract/getContactListByGroupId/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "message" : "string",
  "result" : "object"
}
```


<a name="getcontractbyidusingpost"></a>
#### 根据合同id查询合同
```
POST /contract/getContractById/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Wrapper](#wrapper)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/contract/getContractById/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "message" : "string",
  "result" : "object"
}
```


<a name="getcontractlistwithpageusingpost"></a>
#### 分页获取所有合同列表
```
POST /contract/getContractListWithPage
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**baseQuery**  <br>*可选*|分页排序参数|[BaseQuery](#basequery)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Wrapper](#wrapper)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/contract/getContractListWithPage
```


###### 请求 body
```
json :
{
  "orderBy" : "string",
  "pageNum" : 0,
  "pageSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "message" : "string",
  "result" : "object"
}
```


<a name="savecontractusingpost"></a>
#### 编辑合同,当id为空时新增项目,不为空时为更新项目信息
```
POST /contract/save
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**pmcContractDto**  <br>*必填*|pmcContractDto|[PmcContractDto](#pmccontractdto)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Wrapper](#wrapper)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/contract/save
```


###### 请求 body
```
json :
{
  "agentContent" : "string",
  "alegalName" : "string",
  "assitMoney" : 0,
  "bankAccount" : "string",
  "bankName" : "string",
  "blegalName" : "string",
  "contractCode" : "string",
  "contractName" : "string",
  "contractType" : "string",
  "description" : "string",
  "deviceCount" : 0,
  "endTime" : "2019-12-01 12:18:48",
  "filePath" : "string",
  "id" : 0,
  "isChange" : 0,
  "isDestory" : 0,
  "isPostpone" : 0,
  "isSparePart" : 0,
  "isSpareService" : 0,
  "lastResponseTime" : 0,
  "partyAId" : 0,
  "partyAName" : "string",
  "partyBId" : 0,
  "partyBName" : "string",
  "paymentTime" : "2019-12-01 12:18:48",
  "paymentType" : 0,
  "projectMoney" : 0,
  "recordTime" : 0,
  "signTime" : "2019-12-01 12:18:48",
  "startTime" : "2019-12-01 12:18:48",
  "verification" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "message" : "string",
  "result" : "object"
}
```


<a name="pmc-inspect-device-controller_resource"></a>
### Pmc-inspect-device-controller
Pmc Inspect Device Controller


<a name="deletetaskbyidusingpost"></a>
#### 删除巡检任务
```
POST /InspectDevice/deleteTaskById/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Wrapper](#wrapper)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/InspectDevice/deleteTaskById/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "message" : "string",
  "result" : "object"
}
```


<a name="gettaskbyidusingpost"></a>
#### 根据id获取巡检任务
```
POST /InspectDevice/getTaskById/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Wrapper](#wrapper)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/InspectDevice/getTaskById/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "message" : "string",
  "result" : "object"
}
```


<a name="gettasksbyprojectidusingpost"></a>
#### 获取某个项目的巡检任务
```
POST /InspectDevice/getTasksByProjectId/{projectId}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**projectId**  <br>*必填*|projectId|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Wrapper](#wrapper)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/InspectDevice/getTasksByProjectId/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "message" : "string",
  "result" : "object"
}
```


<a name="saveusingpost"></a>
#### 编辑巡检任务,当id为空时新增项目,不为空时为更新项目信息
```
POST /InspectDevice/save
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**pmcInspectDevideDto**  <br>*必填*|pmcInspectDevideDto|[PmcInspectDevideDto](#pmcinspectdevidedto)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Wrapper](#wrapper)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/InspectDevice/save
```


###### 请求 body
```
json :
{
  "cycleTime" : 0,
  "deadlineTime" : "2019-12-01 12:18:48",
  "dealResult" : "string",
  "description" : "string",
  "deviceName" : "string",
  "deviceType" : "string",
  "id" : 0,
  "inspectionCondition" : 0,
  "inspectionContent" : "string",
  "projectId" : 0,
  "projectName" : "string",
  "scheduledStartTime" : "2019-12-01 12:18:48"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "message" : "string",
  "result" : "object"
}
```


<a name="pmc-project-controller_resource"></a>
### Pmc-project-controller
Pmc Project Controller


<a name="deleteprojectbyidusingpost"></a>
#### 删除项目信息
```
POST /project/deleteProjectById/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Wrapper](#wrapper)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/project/deleteProjectById/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "message" : "string",
  "result" : "object"
}
```


<a name="getprojectbyidusingpost"></a>
#### 根据id查询项目详情
```
POST /project/getById/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Wrapper](#wrapper)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/project/getById/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "message" : "string",
  "result" : "object"
}
```


<a name="getprojectlistbygroupidusingpost"></a>
#### 获取某个组织的项目列表
```
POST /project/getProjectListByGroupId/{groupId}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**groupId**  <br>*必填*|groupId|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Wrapper](#wrapper)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/project/getProjectListByGroupId/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "message" : "string",
  "result" : "object"
}
```


<a name="getprojectlistwithpageusingpost"></a>
#### 分页获取所有项目列表
```
POST /project/getProjectListWithPage
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**baseQuery**  <br>*可选*|分页排序参数|[BaseQuery](#basequery)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Wrapper](#wrapper)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/project/getProjectListWithPage
```


###### 请求 body
```
json :
{
  "orderBy" : "string",
  "pageNum" : 0,
  "pageSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "message" : "string",
  "result" : "object"
}
```


<a name="saveprojectusingpost"></a>
#### 编辑项目,当id为空时新增项目,不为空时为更新项目信息
```
POST /project/save
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**pmcProjectDto**  <br>*必填*|pmcProjectDto|[PmcProjectDto](#pmcprojectdto)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Wrapper](#wrapper)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/project/save
```


###### 请求 body
```
json :
{
  "aoneName" : "string",
  "athreeName" : "string",
  "atwoName" : "string",
  "bname" : "string",
  "contractId" : 0,
  "contractName" : "string",
  "description" : "string",
  "endTime" : "2019-12-01 12:18:48",
  "id" : 0,
  "isContract" : 0,
  "isDestory" : 0,
  "partAId" : 0,
  "partAName" : "string",
  "partyAOne" : "string",
  "partyAThree" : "string",
  "partyATwo" : "string",
  "partyBEmail" : "string",
  "partyBId" : 0,
  "partyBName" : "string",
  "partyBOne" : "string",
  "partyBPhone" : "string",
  "partyBTel" : "string",
  "projectName" : "string",
  "projectType" : "string",
  "startTime" : "2019-12-01 12:18:48"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "message" : "string",
  "result" : "object"
}
```




<a name="definitions"></a>
## 定义

<a name="basequery"></a>
### BaseQuery

|名称|说明|类型|
|---|---|---|
|**orderBy**  <br>*可选*|排序  <br>**样例** : `"string"`|string|
|**pageNum**  <br>*可选*|当前页  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页条数  <br>**样例** : `0`|integer (int32)|


<a name="pmccontractdto"></a>
### PmcContractDto

|名称|说明|类型|
|---|---|---|
|**agentContent**  <br>*可选*|乙方代理内容  <br>**样例** : `"string"`|string|
|**alegalName**  <br>*可选*|**样例** : `"string"`|string|
|**assitMoney**  <br>*可选*|乙供辅料金额  <br>**样例** : `0`|integer (int64)|
|**bankAccount**  <br>*可选*|乙方银行账号  <br>**样例** : `"string"`|string|
|**bankName**  <br>*可选*|乙方开户银行  <br>**样例** : `"string"`|string|
|**blegalName**  <br>*可选*|**样例** : `"string"`|string|
|**contractCode**  <br>*可选*|合同编号  <br>**样例** : `"string"`|string|
|**contractName**  <br>*可选*|合同名称  <br>**样例** : `"string"`|string|
|**contractType**  <br>*可选*|合同类型  <br>**样例** : `"string"`|string|
|**description**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**deviceCount**  <br>*可选*|维修设备数量  <br>**样例** : `0`|integer (int32)|
|**endTime**  <br>*可选*|合同结束时间  <br>**样例** : `"2019-12-01 12:18:48"`|string (date-time)|
|**filePath**  <br>*可选*|附件路径  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|合同id  <br>**样例** : `0`|integer (int64)|
|**isChange**  <br>*可选*|合同是否变更（0-未变更，1-变更）  <br>**样例** : `0`|integer (int32)|
|**isDestory**  <br>*可选*|合同是否作废（0-有效，1-作废）  <br>**样例** : `0`|integer (int32)|
|**isPostpone**  <br>*可选*|是否自动顺延（0-未顺延，1-顺延）  <br>**样例** : `0`|integer (int32)|
|**isSparePart**  <br>*可选*|乙方是否包备品备件（0-不包，1-包）  <br>**样例** : `0`|integer (int32)|
|**isSpareService**  <br>*可选*|乙方是否提供备品备件替换服务（0-不提供，1-提供)  <br>**样例** : `0`|integer (int32)|
|**lastResponseTime**  <br>*可选*|维修维护最迟响应时间,单位小时  <br>**样例** : `0`|integer (int32)|
|**partyAId**  <br>*可选*|甲方id  <br>**样例** : `0`|integer (int64)|
|**partyAName**  <br>*可选*|甲方组织名称  <br>**样例** : `"string"`|string|
|**partyBId**  <br>*可选*|乙方id  <br>**样例** : `0`|integer (int64)|
|**partyBName**  <br>*可选*|乙方组织名称  <br>**样例** : `"string"`|string|
|**paymentTime**  <br>*可选*|付款时间  <br>**样例** : `"2019-12-01 12:18:48"`|string (date-time)|
|**paymentType**  <br>*可选*|支付方式（1-现结、2-账期、3-年结）  <br>**样例** : `0`|integer (int32)|
|**projectMoney**  <br>*可选*|项目金额  <br>**样例** : `0`|integer (int64)|
|**recordTime**  <br>*可选*|月度记录表提交周期，单位天  <br>**样例** : `0`|integer (int32)|
|**signTime**  <br>*可选*|合同签订时间  <br>**样例** : `"2019-12-01 12:18:48"`|string (date-time)|
|**startTime**  <br>*可选*|合同开始时间  <br>**样例** : `"2019-12-01 12:18:48"`|string (date-time)|
|**verification**  <br>*可选*|维修工身份验证流程  <br>**样例** : `"string"`|string|


<a name="pmcinspectdevidedto"></a>
### PmcInspectDevideDto

|名称|说明|类型|
|---|---|---|
|**cycleTime**  <br>*可选*|巡检周期,单位天  <br>**样例** : `0`|integer (int32)|
|**deadlineTime**  <br>*可选*|最晚开始时间  <br>**样例** : `"2019-12-01 12:18:48"`|string (date-time)|
|**dealResult**  <br>*可选*|处理结果  <br>**样例** : `"string"`|string|
|**description**  <br>*可选*|**样例** : `"string"`|string|
|**deviceName**  <br>*可选*|设备名字  <br>**样例** : `"string"`|string|
|**deviceType**  <br>*可选*|设备类型  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|巡检设备id  <br>**样例** : `0`|integer (int64)|
|**inspectionCondition**  <br>*可选*|巡检情况(0-正常，1-不正常)  <br>**样例** : `0`|integer (int32)|
|**inspectionContent**  <br>*可选*|巡检内容  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|项目id  <br>**样例** : `0`|integer (int64)|
|**projectName**  <br>*可选*|项目名称  <br>**样例** : `"string"`|string|
|**scheduledStartTime**  <br>*可选*|预计开始时间  <br>**样例** : `"2019-12-01 12:18:48"`|string (date-time)|


<a name="pmcprojectdto"></a>
### PmcProjectDto

|名称|说明|类型|
|---|---|---|
|**aoneName**  <br>*可选*|**样例** : `"string"`|string|
|**athreeName**  <br>*可选*|**样例** : `"string"`|string|
|**atwoName**  <br>*可选*|**样例** : `"string"`|string|
|**bname**  <br>*可选*|**样例** : `"string"`|string|
|**contractId**  <br>*可选*|合同id  <br>**样例** : `0`|integer (int64)|
|**contractName**  <br>*可选*|合同名称  <br>**样例** : `"string"`|string|
|**description**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**endTime**  <br>*可选*|结束时间（虚拟项目必填)  <br>**样例** : `"2019-12-01 12:18:48"`|string (date-time)|
|**id**  <br>*可选*|项目id  <br>**样例** : `0`|integer (int64)|
|**isContract**  <br>*可选*|是否签署合同（0-没有，1-有，没有签署合同的未虚拟项目）  <br>**样例** : `0`|integer (int32)|
|**isDestory**  <br>*可选*|项目是否作废（0-有效，1-作废）  <br>**样例** : `0`|integer (int32)|
|**partAId**  <br>*可选*|甲方id  <br>**样例** : `0`|integer (int64)|
|**partAName**  <br>*可选*|甲方名称  <br>**样例** : `"string"`|string|
|**partyAOne**  <br>*可选*|甲方项目负责人联系方式1  <br>**样例** : `"string"`|string|
|**partyAThree**  <br>*可选*|甲方项目负责人联系方式3  <br>**样例** : `"string"`|string|
|**partyATwo**  <br>*可选*|甲方负责人2联系方式2  <br>**样例** : `"string"`|string|
|**partyBEmail**  <br>*可选*|方24小时开通邮箱  <br>**样例** : `"string"`|string|
|**partyBId**  <br>*可选*|乙方id  <br>**样例** : `0`|integer (int64)|
|**partyBName**  <br>*可选*|甲方名称  <br>**样例** : `"string"`|string|
|**partyBOne**  <br>*可选*|乙方项目负责人联系方式  <br>**样例** : `"string"`|string|
|**partyBPhone**  <br>*可选*|乙方24小时开通的移动电话  <br>**样例** : `"string"`|string|
|**partyBTel**  <br>*可选*|乙方24小时值班电话  <br>**样例** : `"string"`|string|
|**projectName**  <br>*可选*|项目名称  <br>**样例** : `"string"`|string|
|**projectType**  <br>*可选*|项目类型  <br>**样例** : `"string"`|string|
|**startTime**  <br>*可选*|开始时间（虚拟项目必填）  <br>**样例** : `"2019-12-01 12:18:48"`|string (date-time)|


<a name="wrapper"></a>
### Wrapper

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**message**  <br>*可选*|**样例** : `"string"`|string|
|**result**  <br>*可选*|**样例** : `"object"`|object|




<a name="securityscheme"></a>
## 安全

<a name="authorization"></a>
### Authorization
*类型* : apiKey  
*名称* : Authorization  
*在* : HEADER



