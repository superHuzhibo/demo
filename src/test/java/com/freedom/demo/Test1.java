package com.freedom.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 
 * @version 1.0
 * @author huzhibo
 * @date 2023/2/15 18:55
 */
public class Test1 {
    @Test
    public void test(){
        String s = "{\n" +
                "    \"code\": \"ok\",\n" +
                "    \"message\": \"操作成功\",\n" +
                "    \"total\": 318,\n" +
                "    \"table\": [\n" +
                "        {\n" +
                "            \"eventId\": \"63d860fe919ae2676b7db9c6\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"销售合同发起-选择物料-赋值建议售价\",\n" +
                "            \"triggerType\": \"销售合同发起.字段值改变时\",\n" +
                "            \"executionEvent\": \"历史预测价格.查询数据,销售合同发起.分支节点,分支设置,分支设置,销售合同发起.分支节点,分支设置,分支设置,销售合同发起.字段赋值节点,销售合同发起.字段赋值节点,标准价预测.查询数据,整合数据,销售合同发起.分支节点,分支设置,分支设置,销售合同发起.字段赋值节点,销售合同发起.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63aead8591b777738d22205d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"提交授信申请数据\",\n" +
                "            \"triggerType\": \"客户批量授信管理.表单暂存后触发\",\n" +
                "            \"executionEvent\": \"客户授信预览.提交节点,外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63ae84d591b777738d222043\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"交付数量大于下单数量时不可提交\",\n" +
                "            \"triggerType\": \"逾期合同继续执行申请.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63ae82ce91b777738d22203f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"交付数量大于下单数量时提醒\",\n" +
                "            \"triggerType\": \"逾期合同继续执行申请.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63ae4f9991b777738d222033\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取销售合同物料信息\",\n" +
                "            \"triggerType\": \"逾期合同继续执行申请.字段值改变\",\n" +
                "            \"executionEvent\": \"销售合同发起.查询数据,逾期合同继续执行申请.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63a15b49bd41b730fca3c724\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"删除全部数据\",\n" +
                "            \"triggerType\": \"客户组织结构.自定义按钮\",\n" +
                "            \"executionEvent\": \"客户组织结构.删除数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63993dc88496f757685f9912\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"汇率变更时计算物料的不含税单价\",\n" +
                "            \"triggerType\": \"销售合同发起.字段值改变\",\n" +
                "            \"executionEvent\": \"销售合同发起.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6397ea3583300731d0d8dcbb\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"业务事件赋值测试\",\n" +
                "            \"triggerType\": \"测试业务事件赋值.字段值改变\",\n" +
                "            \"executionEvent\": \"测试业务事件赋值.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6392a24060767f29acd4b438\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"删除批量授信时删除我的待办中审批数据\",\n" +
                "            \"triggerType\": \"客户批量授信管理.表单删除前\",\n" +
                "            \"executionEvent\": \"外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"639190e760767f29acd4b3e2\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"测试\",\n" +
                "            \"triggerType\": \"线索转需求审核.表单保存成功后触发\",\n" +
                "            \"executionEvent\": \"需求提报.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"639190ac60767f29acd4b3e0\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"测试\",\n" +
                "            \"triggerType\": \"\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"639083a9c2e40f3e59b4be6d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"小组成员id-自动带出小组成员信息\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变\",\n" +
                "            \"executionEvent\": \"客户工单管理.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6390537a322ceb1ed3b2ea3c\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"将研发经理人员ID转化为人员信息\",\n" +
                "            \"triggerType\": \"送样申请.字段值改变\",\n" +
                "            \"executionEvent\": \"送样申请.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"639052e2322ceb1ed3b2ea30\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"将工厂技术人员ID转化为人员信息\",\n" +
                "            \"triggerType\": \"送样申请.字段值改变\",\n" +
                "            \"executionEvent\": \"送样申请.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"638f1f85322ceb1ed3b2e9f4\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"新增客户时校验销售视图是否无误\",\n" +
                "            \"triggerType\": \"交易客户审核.销售管理.\",\n" +
                "            \"executionEvent\": \"客户管理.查询数据,交易客户审核.分支节点,分支设置,分支设置,外部节点,外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"638f1811322ceb1ed3b2e9f2\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户变更时校验销售视图是否无误\",\n" +
                "            \"triggerType\": \"客户变更审核.销管.\",\n" +
                "            \"executionEvent\": \"外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"638ed14e322ceb1ed3b2e984\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户变更提交时校验客户信息是否正确\",\n" +
                "            \"triggerType\": \"客户变更审核.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"638eb3b0322ceb1ed3b2e97e\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"新建客户时检验客户信息\",\n" +
                "            \"triggerType\": \"交易客户审核.表单提交前\",\n" +
                "            \"executionEvent\": \"客户管理.查询数据,交易客户审核.分支节点,分支设置,分支设置,外部节点,外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"638d6b55322ceb1ed3b2e8de\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"同步人员工号\",\n" +
                "            \"triggerType\": \"定时触发\",\n" +
                "            \"executionEvent\": \"外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"638d69ad322ceb1ed3b2e8d6\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"同步部门人员\",\n" +
                "            \"triggerType\": \"定时触发\",\n" +
                "            \"executionEvent\": \"外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6389d286322ceb1ed3b2e896\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"市场报告提交时生成待阅数据\",\n" +
                "            \"triggerType\": \"市场报告.表单提交时\",\n" +
                "            \"executionEvent\": \"外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"638854d8322ceb1ed3b2e864\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"判断是否低于建议售价的98%\",\n" +
                "            \"triggerType\": \"销售合同变更.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"销售合同变更.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6385e0ff322ceb1ed3b2e7b8\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"回款目标-每天定时更新\",\n" +
                "            \"triggerType\": \"定时触发\",\n" +
                "            \"executionEvent\": \"外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6385d1d2322ceb1ed3b2e7a4\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"回款目标-同步SAP系统数据\",\n" +
                "            \"triggerType\": \"回款目标.同步回款数据\",\n" +
                "            \"executionEvent\": \"外部节点,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6385b796322ceb1ed3b2e746\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"默认汇率\",\n" +
                "            \"triggerType\": \"信贷放行申请表.表单新建时\",\n" +
                "            \"executionEvent\": \"美元汇率维护.查询数据,信贷放行申请表.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6385a418322ceb1ed3b2e738\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"删除所有数据\",\n" +
                "            \"triggerType\": \"订单一览表.删除\",\n" +
                "            \"executionEvent\": \"订单一览表.删除数据,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63849381322ceb1ed3b2e710\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取SAP系统内回款目标数据\",\n" +
                "            \"triggerType\": \"回款目标.同步回款目标数据\",\n" +
                "            \"executionEvent\": \"外部节点,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63844d6c322ceb1ed3b2e6b8\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"研发类需求-同意后推送文档数据至文档库\",\n" +
                "            \"triggerType\": \"需求提报.同意后\",\n" +
                "            \"executionEvent\": \"文档库.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6380500344c5ed4b50b4049e\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"提交时将上级部门的客户编码带出\",\n" +
                "            \"triggerType\": \"客户组织结构.表单提交前\",\n" +
                "            \"executionEvent\": \"客户组织结构.查询数据,客户组织结构.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63801a5944c5ed4b50b40472\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取紧急发货信息\",\n" +
                "            \"triggerType\": \"销售合同发起.字段值改变\",\n" +
                "            \"executionEvent\": \"紧急发货申请.查询数据,销售合同发起.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637f4ae344c5ed4b50b4042c\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"销售合同发起测试\",\n" +
                "            \"triggerType\": \"销售合同发起测试.字段值改变\",\n" +
                "            \"executionEvent\": \"销售合同发起测试.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637f46c744c5ed4b50b4040e\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取SAP应收数据\",\n" +
                "            \"triggerType\": \"定时触发\",\n" +
                "            \"executionEvent\": \"外部节点,应收一览表.查询数据,计算数据,客户管理.更新数据,客户管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637f432844c5ed4b50b40406\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"变更状态\",\n" +
                "            \"triggerType\": \"价格预测.自定义按钮\",\n" +
                "            \"executionEvent\": \"价格预测.查询数据,价格预测.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637e043d28069d2fe4305393\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"跟进部门赋值\",\n" +
                "            \"triggerType\": \"线索分发.同意后\",\n" +
                "            \"executionEvent\": \"线索池.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637dd1be28069d2fe4305377\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"查询sap应收总额\",\n" +
                "            \"triggerType\": \"应收一览表.\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637dc75028069d2fe4305353\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"将交易客户推送到SAP系统\",\n" +
                "            \"triggerType\": \"客户管理.推送SAP系统\",\n" +
                "            \"executionEvent\": \"外部节点,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637dc41428069d2fe4305343\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"将销售组织赋值到公司代码中\",\n" +
                "            \"triggerType\": \"交易客户审核.字段值改变\",\n" +
                "            \"executionEvent\": \"交易客户审核.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637dc11828069d2fe4305331\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"将销售组织编码赋值到公司代码中\",\n" +
                "            \"triggerType\": \"客户变更审核.字段值改变\",\n" +
                "            \"executionEvent\": \"客户变更审核.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637d940628069d2fe430530d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"变更销售组织以及公司代码信息\",\n" +
                "            \"triggerType\": \"客户管理.变更销售组织信息\",\n" +
                "            \"executionEvent\": \"弹窗节点,外部节点,整合数据,刷新节点,外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637d898b28069d2fe430530b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取海波龙的产品成本价\",\n" +
                "            \"triggerType\": \"定时触发\",\n" +
                "            \"executionEvent\": \"外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637d88a628069d2fe4305305\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户送达方地址修改后推送给SAP系统\",\n" +
                "            \"triggerType\": \"客户地址信息.表单保存时\",\n" +
                "            \"executionEvent\": \"客户管理.查询数据,客户地址信息.分支节点,分支设置,分支设置,外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637d84dc28069d2fe4305303\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户送达方地址新建推送SAP系统\",\n" +
                "            \"triggerType\": \"客户地址信息.表单提交时\",\n" +
                "            \"executionEvent\": \"客户管理.查询数据,客户地址信息.分支节点,分支设置,分支设置,外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637ca35a28069d2fe4305243\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"选择送样工厂-赋值对应样品寄送人\",\n" +
                "            \"triggerType\": \"送样状态跟踪.字段值改变时\",\n" +
                "            \"executionEvent\": \"送样状态跟踪.分支节点,分支设置,分支设置,SAP工厂信息.查询数据,送样状态跟踪.字段赋值节点,送样状态跟踪.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637c8b5e28069d2fe430521d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"紧急发货-是否低于建议售价98%\",\n" +
                "            \"triggerType\": \"紧急发货申请.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"紧急发货申请.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637c811528069d2fe43051ef\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"紧急发货中获取美元汇率\",\n" +
                "            \"triggerType\": \"紧急发货申请.表单新建时\",\n" +
                "            \"executionEvent\": \"美元汇率维护.查询数据,紧急发货申请.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637c7eea28069d2fe43051e5\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取美元的汇率\",\n" +
                "            \"triggerType\": \"销售询报价.表单新建时\",\n" +
                "            \"executionEvent\": \"美元汇率维护.查询数据,销售询报价.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637c622b28069d2fe43051ab\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户变更时计算物料的不含税单价\",\n" +
                "            \"triggerType\": \"销售合同发起.字段值改变时\",\n" +
                "            \"executionEvent\": \"销售合同发起.分支节点,分支设置,分支设置,销售合同发起.字段赋值节点,销售合同发起.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637c60fb28069d2fe4305195\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"计算国内客户不含税单价\",\n" +
                "            \"triggerType\": \"销售合同发起.字段值改变\",\n" +
                "            \"executionEvent\": \"销售合同发起.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637c5fdb28069d2fe430518f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"实际价格变更时计算物料的不含税单价\",\n" +
                "            \"triggerType\": \"销售合同发起.字段值改变时\",\n" +
                "            \"executionEvent\": \"销售合同发起.分支节点,分支设置,分支设置,销售合同发起.字段赋值节点,销售合同发起.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637c5c6628069d2fe4305189\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取物料组的产品成本\",\n" +
                "            \"triggerType\": \"销售合同发起.字段值改变\",\n" +
                "            \"executionEvent\": \"产品成本价格表.查询数据,销售合同发起.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637c3f9828069d2fe430517f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"定时更新客户的授信数据\",\n" +
                "            \"triggerType\": \"定时触发\",\n" +
                "            \"executionEvent\": \"客户管理.查询数据,应收一览表.查询数据,计算数据,客户管理.更新数据,客户管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637ae50728069d2fe4305019\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"需求编辑保存-校验需求审批意见\",\n" +
                "            \"triggerType\": \"需求提报.表单保存前\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63774eec28069d2fe4304fb9\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"季度审批失败后将状态和时间同步到授信一览表中\",\n" +
                "            \"triggerType\": \"外部节点触发\",\n" +
                "            \"executionEvent\": \"客户授信预览.更新数据,客户批量授信管理.查询数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63774d9e28069d2fe4304fad\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"授信额度提交后编码同步到一览表中\",\n" +
                "            \"triggerType\": \"客户批量授信管理.表单暂存后触发\",\n" +
                "            \"executionEvent\": \"客户批量授信管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63774be128069d2fe4304fa5\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"季度审批通过后将状态和时间同步到授信一览表并将数据返回客户管理中\",\n" +
                "            \"triggerType\": \"外部节点触发\",\n" +
                "            \"executionEvent\": \"客户授信预览.更新数据,客户批量授信管理.查询数据,客户管理.更新数据,客户管理.更新数据,外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6377450d28069d2fe4304fa3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取最新的美元汇率\",\n" +
                "            \"triggerType\": \"销售合同发起.表单新建时\",\n" +
                "            \"executionEvent\": \"美元汇率维护.查询数据,销售合同发起.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63773a2e28069d2fe4304f9b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"打开新建跟进页面\",\n" +
                "            \"triggerType\": \"线索跟进.新建跟进内容\",\n" +
                "            \"executionEvent\": \"线索跟进记录.调用节点,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637736c228069d2fe4304f81\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"样品送样类-转化研发类需求\",\n" +
                "            \"triggerType\": \"简化类需求提报.自定义按钮\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6377164228069d2fe4304f4b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"合同终止通过后将状态推送到合同一览表中，或合同变更后需将合同附件\",\n" +
                "            \"triggerType\": \"外部节点触发\",\n" +
                "            \"executionEvent\": \"销售合同变更.查询数据,分支节点,分支设置,分支设置,文档库.更新数据,合同一览表.更新数据,销售合同发起.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6376fc5928069d2fe4304f45\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"批量价格审批失败后状态同步到价格预测中\",\n" +
                "            \"triggerType\": \"外部节点触发\",\n" +
                "            \"executionEvent\": \"价格预测批量审批.查询数据,价格预测.查询数据,整合数据,价格预测.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6376f51e28069d2fe4304f3f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"批量价格审批成功后状态同步到价格预测中\",\n" +
                "            \"triggerType\": \"外部节点触发\",\n" +
                "            \"executionEvent\": \"价格预测.更新数据,价格预测批量审批.查询数据,价格预测.查询数据,整合数据,外部节点,历史预测价格.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6376eed628069d2fe4304f17\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"销量目标-签收量获取\",\n" +
                "            \"triggerType\": \"定时触发\",\n" +
                "            \"executionEvent\": \"外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6376e10a28069d2fe4304f05\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"特殊额度同意后同步到客户主数据\",\n" +
                "            \"triggerType\": \"外部节点触发\",\n" +
                "            \"executionEvent\": \"客户特殊授信申请表.查询数据,分支节点,分支设置,分支设置,分支设置,客户管理.更新数据,客户管理.更新数据,客户管理.更新数据,外部节点,外部节点,外部节点,外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6376df1c28069d2fe4304f01\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"技术/质量协议审批通过后文件归档\",\n" +
                "            \"triggerType\": \"外部节点触发\",\n" +
                "            \"executionEvent\": \"技术/质量协议发起.查询数据,文档库.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6376dda828069d2fe4304eff\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"框架协议审批通过后文件归档\",\n" +
                "            \"triggerType\": \"外部节点触发\",\n" +
                "            \"executionEvent\": \"文档库.新增数据,框架协议发起.查询数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6376dbe428069d2fe4304efb\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"补录紧急发货流程状态更改\",\n" +
                "            \"triggerType\": \"销售合同发起.表单保存或提交时\",\n" +
                "            \"executionEvent\": \"紧急发货申请.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6376d94928069d2fe4304ef1\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"销售合同被拒绝后数据同步\",\n" +
                "            \"triggerType\": \"外部节点触发\",\n" +
                "            \"executionEvent\": \"销售合同发起.查询数据,分支节点,分支设置,分支设置,紧急发货申请.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6375a193c63a1918031faf57\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"删除全部数据\",\n" +
                "            \"triggerType\": \"合同一览表.自定义按钮\",\n" +
                "            \"executionEvent\": \"合同一览表.删除数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63759454c63a1918031faf4d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"销售合同审批通过后数据推送\",\n" +
                "            \"triggerType\": \"外部节点触发\",\n" +
                "            \"executionEvent\": \"外部节点,销售合同-物料子表.查询数据,产品历史价格.更新数据,产品历史价格详细.新增数据,销售合同发起.查询数据,分支节点,分支设置,分支设置,合同回签.新增数据,合同回签.新增数据,文档库.更新数据,合同一览表.新增数据,销售合同发起.查询数据,整合数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63758e41c63a1918031faf45\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"合同提交前推送到SAP进行审批\",\n" +
                "            \"triggerType\": \"销售合同发起.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6374d6fcc63a1918031faf2f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"同步SAP系统中订单信息\",\n" +
                "            \"triggerType\": \"定时触发\",\n" +
                "            \"executionEvent\": \"外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63744009c63a1918031fae93\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"对账后，对账状态更改为已对账\",\n" +
                "            \"triggerType\": \"对账提醒.同意后\",\n" +
                "            \"executionEvent\": \"对账提醒.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63736794c63a1918031fae07\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取客户约定预测价格\",\n" +
                "            \"triggerType\": \"价格预测.更新预测价格数据\",\n" +
                "            \"executionEvent\": \"弹窗节点,价格预测.查询数据,整合数据,外部节点,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63735828c63a1918031fadff\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"部门周报提交二次校验\",\n" +
                "            \"triggerType\": \"部门周报.表单提交前\",\n" +
                "            \"executionEvent\": \"弹窗节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637355f8c63a1918031fade9\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"个人月报提交二次校验\",\n" +
                "            \"triggerType\": \"个人月报.表单提交前\",\n" +
                "            \"executionEvent\": \"弹窗节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6373556bc63a1918031fade7\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"个人周报提交二次校验\",\n" +
                "            \"triggerType\": \"个人周报.表单提交前\",\n" +
                "            \"executionEvent\": \"弹窗节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63734fe1c63a1918031fadc7\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"送样申请通过-同步跟踪、项目信息\",\n" +
                "            \"triggerType\": \"外部节点触发\",\n" +
                "            \"executionEvent\": \"送样申请.查询数据,送样状态跟踪.新增数据,送样状态跟踪.查询数据,销售项目管理.更新数据,需求提报.查询数据,销售项目管理.更新数据,客户管理.查询数据,销售项目管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637347e7c63a1918031fad8b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取标准价格预测数据\",\n" +
                "            \"triggerType\": \"标准价预测.更新预测价格\",\n" +
                "            \"executionEvent\": \"弹窗节点,标准价预测.查询数据,整合数据,外部节点,整合数据,标准价预测.更新数据,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6372fce7c63a1918031fad09\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"客户视图信息自动带出\",\n" +
                "            \"triggerType\": \"交易客户审核.表单新建或编辑时\",\n" +
                "            \"executionEvent\": \"交易客户审核.分支节点,分支设置,分支设置,交易客户审核.字段赋值节点,交易客户审核.字段赋值节点,查询数据,查询数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6372f8e5c63a1918031facf1\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"合同有效性校验\",\n" +
                "            \"triggerType\": \"\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"637216fec63a1918031facab\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"价格公式推送到价格预测以及标准价预测表中\",\n" +
                "            \"triggerType\": \"外部节点触发\",\n" +
                "            \"executionEvent\": \"分支节点,分支设置,分支设置,价格公式维护.查询数据,价格公式预览.更新数据,价格公式预览.更新数据,外部节点,整合数据,标准价预测.更新数据,外部节点,价格预测.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63720e27c63a1918031faca3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"赋值网址\",\n" +
                "            \"triggerType\": \"原材料价格维护.网址\",\n" +
                "            \"executionEvent\": \"原材料价格维护.更新数据,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63720d30c63a1918031fac9d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"赋值网址\",\n" +
                "            \"triggerType\": \"原材料价格维护.\",\n" +
                "            \"executionEvent\": \"原材料价格维护.更新数据,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63720352c63a1918031fac8f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"赋值网址\",\n" +
                "            \"triggerType\": \"原材料价格维护.自定义按钮\",\n" +
                "            \"executionEvent\": \"原材料价格维护.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6371f5e9c63a1918031fac6b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"测试导出功能\",\n" +
                "            \"triggerType\": \"webhook解析测试.\",\n" +
                "            \"executionEvent\": \"自定义节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6371ef43c63a1918031fac65\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"合同终止或变更唯一性校验\",\n" +
                "            \"triggerType\": \"销售合同变更.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"数据校验,销售合同变更.查询数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6371d1a9c63a1918031fab9f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"赋值销售经理确认合同总金额（CNY）\",\n" +
                "            \"triggerType\": \"销售合同变更.字段值改变时\",\n" +
                "            \"executionEvent\": \"销售合同变更.分支节点,分支设置,分支设置,销售合同变更.字段赋值节点,销售合同变更.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6371996ec63a1918031faaad\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取销售经理确认合同总金额（CNY）数据\",\n" +
                "            \"triggerType\": \"紧急发货申请.字段值改变时\",\n" +
                "            \"executionEvent\": \"紧急发货申请.分支节点,分支设置,分支设置,紧急发货申请.字段赋值节点,紧急发货申请.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636f97bfc63a1918031faa5b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"默认质量协议合同的产品组\",\n" +
                "            \"triggerType\": \"技术/质量协议发起.表单新建时\",\n" +
                "            \"executionEvent\": \"技术/质量协议发起.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636f958fc63a1918031faa51\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"默认框架协议的产品组\",\n" +
                "            \"triggerType\": \"框架协议发起.表单新建时\",\n" +
                "            \"executionEvent\": \"框架协议发起.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636f87cec63a1918031faa19\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"价格公式的唯一性确认\",\n" +
                "            \"triggerType\": \"价格公式维护.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"价格公式维护.分支节点,分支设置,分支设置,数据校验,价格公式维护.查询数据,价格公式维护.查询数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636f6208c63a1918031fa96d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"更改对账规则后-判断字段为空\",\n" +
                "            \"triggerType\": \"对账规则.表单提交成功后触发\",\n" +
                "            \"executionEvent\": \"对账规则.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636f61c5c63a1918031fa96b\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"价格预测数据不能为空\",\n" +
                "            \"triggerType\": \"价格预测.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636f6128c63a1918031fa967\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"标准价格预测数据不能为空\",\n" +
                "            \"triggerType\": \"标准价预测.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636f6113c63a1918031fa965\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"月底清空对账规则中的判断字段\",\n" +
                "            \"triggerType\": \"定时触发\",\n" +
                "            \"executionEvent\": \"对账规则.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636f542ac63a1918031fa909\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取客户约定价格预测数据\",\n" +
                "            \"triggerType\": \"价格预测.获取预测价格\",\n" +
                "            \"executionEvent\": \"价格公式预览.查询数据,价格预测.分支节点,分支设置,分支设置,外部节点,外部节点,价格预测.字段赋值节点,价格预测.字段赋值节点,计算数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636f3576c63a1918031fa8b7\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"每天更新对账规则表单中-当前日期所属天数字段\",\n" +
                "            \"triggerType\": \"定时触发\",\n" +
                "            \"executionEvent\": \"对账规则.查询数据,对账提醒.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636f20c3c63a1918031fa861\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"定时获取SRM系统的原材料预测价格信息\",\n" +
                "            \"triggerType\": \"定时触发\",\n" +
                "            \"executionEvent\": \"外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636e10f4c63a1918031fa80f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"同意后，开票状态更新为已完成\",\n" +
                "            \"triggerType\": \"开票申请.工厂财务.\",\n" +
                "            \"executionEvent\": \"开票明细-隐藏表单.更新数据,客户管理.查询数据,开票申请.分支节点,分支设置,分支设置,计算数据,开票明细-隐藏表单.查询数据,合同一览表.更新数据,合同一览表.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636e0855c63a1918031fa7f3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取询报价总额（CNY）\",\n" +
                "            \"triggerType\": \"销售询报价.字段值改变时\",\n" +
                "            \"executionEvent\": \"销售询报价.分支节点,分支设置,分支设置,销售询报价.字段赋值节点,销售询报价.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636e06b7c63a1918031fa7eb\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"销售询报价新建时默认产品组\",\n" +
                "            \"triggerType\": \"销售询报价.表单新建时\",\n" +
                "            \"executionEvent\": \"销售询报价.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636e0030c63a1918031fa7d3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"赋值销售经理确认金额（CNY）\",\n" +
                "            \"triggerType\": \"销售合同发起.字段值改变时\",\n" +
                "            \"executionEvent\": \"销售合同发起.分支节点,分支设置,分支设置,销售合同发起.字段赋值节点,销售合同发起.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636ddd53c63a1918031fa78f\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"D4填写同意前-校验纳期晚于今天\",\n" +
                "            \"triggerType\": \"客户工单管理.D4信息填写.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636dbf7dc63a1918031fa785\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"提交后-客户报告至文档库\",\n" +
                "            \"triggerType\": \"客户工单管理.同意后\",\n" +
                "            \"executionEvent\": \"文档库.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636ce8bdc63a1918031fa6e1\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"测试导入功能\",\n" +
                "            \"triggerType\": \"webhook解析测试.\",\n" +
                "            \"executionEvent\": \"弹窗节点,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636cd90dc63a1918031fa6d3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"同意前-赋值CQE负责人\",\n" +
                "            \"triggerType\": \"客户工单管理.同意前\",\n" +
                "            \"executionEvent\": \"客户工单管理.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636c9046c63a1918031fa681\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"产品类型去重-赋值产品类型下拉框数据字典\",\n" +
                "            \"triggerType\": \"送样申请.字段值改变时\",\n" +
                "            \"executionEvent\": \"送样申请.分支节点,分支设置,分支设置,分支设置,送样申请.字段赋值节点,送样申请.字段赋值节点,送样申请.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636c641dc63a1918031fa64b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取子表单价是否低于建议售价的98%\",\n" +
                "            \"triggerType\": \"销售合同发起.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"销售合同发起.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636b638ac63a1918031fa605\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"销量预测-新增销量目标\",\n" +
                "            \"triggerType\": \"销量预测.表单提交时\",\n" +
                "            \"executionEvent\": \"销量目标.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636b536fc63a1918031fa5d1\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"审批提交前，校验变更评审状态\",\n" +
                "            \"triggerType\": \"需求变更.变更评审意见反馈.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636a095bc63a1918031fa51d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"数据推送到预览表\",\n" +
                "            \"triggerType\": \"价格公式维护.数据推送到预览表\",\n" +
                "            \"executionEvent\": \"价格公式预览.更新数据,价格公式维护.更新数据,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6369c7a2c63a1918031fa4e5\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"清空失效客户的客户经理数据\",\n" +
                "            \"triggerType\": \"客户管理.清空失效客户的客户经理数据\",\n" +
                "            \"executionEvent\": \"客户管理.更新数据,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6369029fc63a1918031fa4cf\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"订单数据同步到合同中\",\n" +
                "            \"triggerType\": \"定时触发\",\n" +
                "            \"executionEvent\": \"合同一览表.查询数据,订单一览表.查询数据,销售合同发起.查询数据,合同一览表.更新数据,分支节点,分支设置,分支设置,计算数据,分支节点,分支设置,分支设置,合同一览表.更新数据,合同一览表.更新数据,合同一览表.更新数据,合同一览表.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63690095c63a1918031fa4cd\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"D4拒绝后，清空报告数据\",\n" +
                "            \"triggerType\": \"客户工单管理.CUS_confuse_AFTER\",\n" +
                "            \"executionEvent\": \"客户工单管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6368fae1c63a1918031fa4c3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户工单管理-风险品处理方案子表赋值\",\n" +
                "            \"triggerType\": \"客户工单管理.表单新建时\",\n" +
                "            \"executionEvent\": \"风险品处理方案-下拉列表隐藏.查询数据,客户工单管理.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6368e840c63a1918031fa463\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"将8D任务人员ID转化为人员信息\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变\",\n" +
                "            \"executionEvent\": \"客户工单管理.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6368e79fc63a1918031fa45f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"将VOC任务分发人员ID转化为人员信息\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变\",\n" +
                "            \"executionEvent\": \"客户工单管理.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63685c9dc63a1918031fa325\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"生成合同标题\",\n" +
                "            \"triggerType\": \"销售合同发起.字段值改变\",\n" +
                "            \"executionEvent\": \"销售合同发起.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63685a8bc63a1918031fa31b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"销售合同默认给产品组赋值\",\n" +
                "            \"triggerType\": \"销售合同发起.表单新建时\",\n" +
                "            \"executionEvent\": \"销售合同发起.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63685921c63a1918031fa313\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"更改合同状态\",\n" +
                "            \"triggerType\": \"销售合同发起.状态变更\",\n" +
                "            \"executionEvent\": \"销售合同发起.更新数据,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63679874c63a1918031fa24f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"同步合同号到子表\",\n" +
                "            \"triggerType\": \"销售合同发起.表单保存或提交时\",\n" +
                "            \"executionEvent\": \"销售合同发起.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63678aaac63a1918031fa21b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取建议售价\",\n" +
                "            \"triggerType\": \"信贷放行申请表.字段值改变时\",\n" +
                "            \"executionEvent\": \"历史预测价格.查询数据,信贷放行申请表.分支节点,分支设置,分支设置,信贷放行申请表.分支节点,分支设置,分支设置,信贷放行申请表.字段赋值节点,信贷放行申请表.字段赋值节点,标准价预测.查询数据,信贷放行申请表.分支节点,分支设置,分支设置,信贷放行申请表.字段赋值节点,信贷放行申请表.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6364eb0fc63a1918031fa1db\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"将拒绝信息返回但客户管理中\",\n" +
                "            \"triggerType\": \"交易客户审核.拒绝后\",\n" +
                "            \"executionEvent\": \"客户管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6364ead8c63a1918031fa1d9\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"将拒绝信息返回到客户管理中\",\n" +
                "            \"triggerType\": \"交易客户审核.拒绝后\",\n" +
                "            \"executionEvent\": \"客户管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6364a8ddc63a1918031fa1a3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"D4客户报告推送文档库\",\n" +
                "            \"triggerType\": \"客户工单管理.同意后\",\n" +
                "            \"executionEvent\": \"文档库.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6364a83cc63a1918031fa19f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"D3报告推送文档库\",\n" +
                "            \"triggerType\": \"客户工单管理.同意后\",\n" +
                "            \"executionEvent\": \"文档库.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6364a5bac63a1918031fa18f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取部门人员填写的周报数据\",\n" +
                "            \"triggerType\": \"部门周报.字段值改变时\",\n" +
                "            \"executionEvent\": \"个人周报-本周回款子表.查询数据,部门周报.字段赋值节点,部门周报.分支节点,分支设置,分支设置,数据校验,刷新节点,个人周报-本周销售子表.查询数据,部门周报.字段赋值节点,个人周报-本周项目子表.查询数据,部门周报.字段赋值节点,个人周报-下周回款子表.查询数据,部门周报.字段赋值节点,个人周报-下周销量子表.查询数据,部门周报.字段赋值节点,个人周报-下周项目子表.查询数据,部门周报.字段赋值节点,个人周报-下周出差计划子表.查询数据,部门周报.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63639940c63a1918031fa009\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"D7附件推送文档库\",\n" +
                "            \"triggerType\": \"客户工单管理.同意后\",\n" +
                "            \"executionEvent\": \"文档库.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63639881c63a1918031fa005\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"D6文件推送文档库\",\n" +
                "            \"triggerType\": \"客户工单管理.同意后\",\n" +
                "            \"executionEvent\": \"文档库.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63639746c63a1918031fa001\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"D5文件推送至文档库\",\n" +
                "            \"triggerType\": \"客户工单管理.同意后\",\n" +
                "            \"executionEvent\": \"文档库.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63639456c63a1918031f9fff\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"进展赋值\",\n" +
                "            \"triggerType\": \"客户工单管理.\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63637482c63a1918031f9fa3\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"部门月报月内提交次数校验\",\n" +
                "            \"triggerType\": \"部门月报.表单提交前\",\n" +
                "            \"executionEvent\": \"个人月报.查询数据,计算数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63637175c63a1918031f9f8b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"个人月报月内提交次数校验\",\n" +
                "            \"triggerType\": \"个人月报.表单提交前\",\n" +
                "            \"executionEvent\": \"个人月报.查询数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63636956c63a1918031f9f79\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"部门周报周内提交次数校验\",\n" +
                "            \"triggerType\": \"部门周报.表单提交前\",\n" +
                "            \"executionEvent\": \"部门周报.查询数据,计算数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63635048c63a1918031f9f5f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"计算本月回款总额\",\n" +
                "            \"triggerType\": \"部门月报.字段值改变时\",\n" +
                "            \"executionEvent\": \"回款目标.查询数据,计算数据,部门月报.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636269d0c63a1918031f9f1f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"计算本月回款总额\",\n" +
                "            \"triggerType\": \"部门周报.字段值改变时\",\n" +
                "            \"executionEvent\": \"回款目标.查询数据,计算数据,部门周报.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63626174c63a1918031f9f13\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"个人周报周内提交次数校验\",\n" +
                "            \"triggerType\": \"个人周报.表单提交前\",\n" +
                "            \"executionEvent\": \"数据校验,个人周报.查询数据,计算数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"636226de853c9d5b0b02c6d6\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"客户工单管理-投诉日期校验\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6361e1cb853c9d5b0b02c6ac\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"回款目标-暂存前校验\",\n" +
                "            \"triggerType\": \"回款目标.表单暂存前触发\",\n" +
                "            \"executionEvent\": \"回款目标.查询数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6361e013853c9d5b0b02c69e\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"回款目标-提交前校验\",\n" +
                "            \"triggerType\": \"回款目标.表单提交前\",\n" +
                "            \"executionEvent\": \"回款目标.查询数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6361d604853c9d5b0b02c694\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"VOC报告推送到文档库\",\n" +
                "            \"triggerType\": \"客户工单管理.同意后\",\n" +
                "            \"executionEvent\": \"文档库.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6361cc66853c9d5b0b02c67c\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"D5拒绝后清空\",\n" +
                "            \"triggerType\": \"客户工单管理.CUS_confuse_dfive_AFTER\",\n" +
                "            \"executionEvent\": \"客户工单管理.清空时间和附件\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6361cbef853c9d5b0b02c67a\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"D6拒绝后清空\",\n" +
                "            \"triggerType\": \"客户工单管理.CUS_confuse_dsix_AFTER\",\n" +
                "            \"executionEvent\": \"客户工单管理.清空时间和附件\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6361c9d7853c9d5b0b02c674\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"拒绝后清空\",\n" +
                "            \"triggerType\": \"客户工单管理.CUS_confuse_dseven_AFTER\",\n" +
                "            \"executionEvent\": \"客户工单管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6361009f853c9d5b0b02c606\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"内部满意度评价-提交前校验\",\n" +
                "            \"triggerType\": \"内部满意度评价.表单提交前\",\n" +
                "            \"executionEvent\": \"内部满意度评价.查询数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6360ffc4853c9d5b0b02c604\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户年度满意度调查-提交前校验\",\n" +
                "            \"triggerType\": \"客户年度满意度调查问卷.表单提交前\",\n" +
                "            \"executionEvent\": \"客户年度满意度调查问卷.查询数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6360ff1d853c9d5b0b02c602\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"内部满意度评价-暂存时校验\",\n" +
                "            \"triggerType\": \"内部满意度评价.表单暂存前触发\",\n" +
                "            \"executionEvent\": \"内部满意度评价.查询数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6360fc88853c9d5b0b02c600\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户年度满意度调查-暂存时校验\",\n" +
                "            \"triggerType\": \"客户年度满意度调查问卷.表单暂存前触发\",\n" +
                "            \"executionEvent\": \"客户年度满意度调查问卷.查询数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6360e8f6853c9d5b0b02c5e0\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户4M变更-客户批准报告推送至文档库\",\n" +
                "            \"triggerType\": \"客户工单管理.同意后\",\n" +
                "            \"executionEvent\": \"文档库.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6360e7c6853c9d5b0b02c5de\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户4M变更-可行性分析报告归档至文档库\",\n" +
                "            \"triggerType\": \"客户工单管理.同意后\",\n" +
                "            \"executionEvent\": \"文档库.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6360bf73853c9d5b0b02c576\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取询报价中产品信息\",\n" +
                "            \"triggerType\": \"销售合同发起.字段值改变\",\n" +
                "            \"executionEvent\": \"销售询报价.查询数据,销售合同发起.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6360aac0853c9d5b0b02c558\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"计算本月回款总额\",\n" +
                "            \"triggerType\": \"个人月报.字段值改变时\",\n" +
                "            \"executionEvent\": \"回款目标.查询数据,计算数据,个人月报.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63607662853c9d5b0b02c530\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"计算该客户当月回款总额\",\n" +
                "            \"triggerType\": \"个人周报.字段值改变时\",\n" +
                "            \"executionEvent\": \"回款目标.查询数据,计算数据,个人周报.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635fbdc1853c9d5b0b02c500\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"转需求拒绝时状态更改\",\n" +
                "            \"triggerType\": \"线索转需求审核.拒绝后\",\n" +
                "            \"executionEvent\": \"线索跟进.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635fbd66853c9d5b0b02c4fe\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"转需求状态提交\",\n" +
                "            \"triggerType\": \"线索转需求审核.表单提交时\",\n" +
                "            \"executionEvent\": \"线索跟进.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635f3fa6853c9d5b0b02c3a4\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"临时赋值CQE\",\n" +
                "            \"triggerType\": \"客户工单管理.临时赋值CQE负责人按钮\",\n" +
                "            \"executionEvent\": \"弹窗节点,整合数据,客户工单管理.更新数据,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635f23c6853c9d5b0b02c372\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"工厂CQE\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变\",\n" +
                "            \"executionEvent\": \"客户工单管理.是否有效客诉-字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635ba7f3853c9d5b0b02c330\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"赋值有效期截止日期\",\n" +
                "            \"triggerType\": \"客户批量授信管理.字段值改变\",\n" +
                "            \"executionEvent\": \"客户批量授信管理.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635ba711853c9d5b0b02c32c\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"赋值本季度日期\",\n" +
                "            \"triggerType\": \"客户批量授信管理.表单新建时\",\n" +
                "            \"executionEvent\": \"客户批量授信管理.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635ba3c3853c9d5b0b02c322\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"定时每季度初将审批通过的授信额度数据更新到客户信息中\",\n" +
                "            \"triggerType\": \"定时触发\",\n" +
                "            \"executionEvent\": \"客户授信预览.查询数据,客户管理.更新数据,客户管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635b9db5853c9d5b0b02c308\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"提交前校验\",\n" +
                "            \"triggerType\": \"线索池.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"线索池.查询数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635b93b2853c9d5b0b02c28c\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"测试结果跟进-提交前校验预计测试时间、计划反馈时间\",\n" +
                "            \"triggerType\": \"测试结果跟进.表单提交前\",\n" +
                "            \"executionEvent\": \"数据校验,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635b92d7853c9d5b0b02c286\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"测试结果跟进-校验计划反馈时间\",\n" +
                "            \"triggerType\": \"测试结果跟进.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },";
        String s1 = "\n" +
                "        {\n" +
                "            \"eventId\": \"635b927a853c9d5b0b02c282\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"测试结果跟进-预计测试时间校验\",\n" +
                "            \"triggerType\": \"测试结果跟进.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635b9099853c9d5b0b02c27a\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"送样状态跟踪-提交前、校验确定送样日期\",\n" +
                "            \"triggerType\": \"送样状态跟踪.表单提交前\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635b903a853c9d5b0b02c274\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"送样状态跟踪-校验确定送样时间\",\n" +
                "            \"triggerType\": \"送样状态跟踪.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635b7c55853c9d5b0b02c20a\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"送样申请-取消选择客户时-清空送样地址、联系人\",\n" +
                "            \"triggerType\": \"送样申请.字段值改变\",\n" +
                "            \"executionEvent\": \"送样申请.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635b7ac2853c9d5b0b02c204\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"送样申请-提交前-校验期望送样时间\",\n" +
                "            \"triggerType\": \"送样申请.表单提交前\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635b79a6853c9d5b0b02c1fe\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"送样申请-期望送样日期变更校验\",\n" +
                "            \"triggerType\": \"送样申请.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635b702f853c9d5b0b02c1e8\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"拒绝后将线索跟进状态更改\",\n" +
                "            \"triggerType\": \"线索关闭审核.拒绝后\",\n" +
                "            \"executionEvent\": \"线索跟进.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635b6f29853c9d5b0b02c1e6\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"线索关闭时状态更改\",\n" +
                "            \"triggerType\": \"线索关闭审核.表单保存或提交时\",\n" +
                "            \"executionEvent\": \"线索跟进.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635b4c46853c9d5b0b02c1ac\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"简化类需求提报-提交前校验客户期望送样时间\",\n" +
                "            \"triggerType\": \"简化类需求提报.表单提交前\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635b49fe853c9d5b0b02c1aa\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"简化类需求提报-研发类需求-警告提醒\",\n" +
                "            \"triggerType\": \"简化类需求提报.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635b4835853c9d5b0b02c18e\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"样品送样类需求提报-客户期望时间不晚于今天\",\n" +
                "            \"triggerType\": \"简化类需求提报.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635a4476ddd10d4fefc44331\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"删除数据\",\n" +
                "            \"triggerType\": \"SAP付款条件.自定义按钮\",\n" +
                "            \"executionEvent\": \"SAP付款条件.删除数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635a2a04ddd10d4fefc44313\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户提交前校验税号是否重复\",\n" +
                "            \"triggerType\": \"交易客户审核.表单提交前\",\n" +
                "            \"executionEvent\": \"客户管理.查询数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635a28faddd10d4fefc44311\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户变更时校验税号是否是唯一\",\n" +
                "            \"triggerType\": \"客户变更审核.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"客户管理.查询数据,数据校验,客户变更审核.查询数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6359d6e7ddd10d4fefc442c9\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户转交易客户暂存时将数据同步到潜客中\",\n" +
                "            \"triggerType\": \"交易客户审核.表单暂存后触发\",\n" +
                "            \"executionEvent\": \"客户管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6358d67dddd10d4fefc44281\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"绩效考核-提交前校验项目权重\",\n" +
                "            \"triggerType\": \"绩效考核.表单提交前\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6358a0baddd10d4fefc44247\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"开票申请提交后-发送邮件提醒财务开票\",\n" +
                "            \"triggerType\": \"\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63589ed8ddd10d4fefc44241\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"开票申请-发票号填写后-更新合同一览表已开票金额\",\n" +
                "            \"triggerType\": \"开票明细-隐藏表单.字段值改变\",\n" +
                "            \"executionEvent\": \"合同一览表.更新合同已开票数量,开票明细-隐藏表单.查询数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63588532ddd10d4fefc4420d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"开票申请-提交前校验开票数量\",\n" +
                "            \"triggerType\": \"开票申请.表单提交前\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635884b1ddd10d4fefc44209\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"开票数量-变更校验数量少于剩余开票数量\",\n" +
                "            \"triggerType\": \"开票申请.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6357a187ddd10d4fefc441d5\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取内部满意度评价平均分\",\n" +
                "            \"triggerType\": \"客户年度满意度调查问卷.计算客户最终满意度\",\n" +
                "            \"executionEvent\": \"内部满意度评价.查询数据,客户年度满意度调查问卷.更新数据,计算数据,整合数据,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63577f53ddd10d4fefc441b7\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户批准报告提交时间校验\",\n" +
                "            \"triggerType\": \"客户工单管理.客户批准报告上传.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63577ef8ddd10d4fefc441b5\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户4M变更-可行性分析报告提交时间校验\",\n" +
                "            \"triggerType\": \"客户工单管理.可行性分析报告上传.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63575145ddd10d4fefc441a9\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户报告提交时间、是否提交校验\",\n" +
                "            \"triggerType\": \"客户工单管理.CQE审批根本原因.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63574fbbddd10d4fefc441a7\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"流转D4前校验\",\n" +
                "            \"triggerType\": \"客户工单管理.D3填写.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63574ed8ddd10d4fefc441a3\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"投诉产品生产日期校验\",\n" +
                "            \"triggerType\": \"客户工单管理.D2填写.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63574dafddd10d4fefc4419f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户4M变更-客户批准文件提交时间校验\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63574d13ddd10d4fefc4419b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户4M变更-可行性分析报告提交时间校验\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63574c00ddd10d4fefc4418d\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"D7客户报告提交时间校验\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63574bc6ddd10d4fefc44189\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"D6客户报告提交时间校验\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63574b90ddd10d4fefc44185\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"D5客户报告提交时间校验\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63574b19ddd10d4fefc44181\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"D5措施信息-计划完成时间校验\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6357427eddd10d4fefc4417d\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"8D流程-D4报告提交时间校验\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6357420bddd10d4fefc44179\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"8D流程-D4根本原因分析-纳期校验\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635741cfddd10d4fefc44175\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"8D流程-项目措施-计划完成时间校验\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6357418dddd10d4fefc44171\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"8D流程-D3报告提交时间校验\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63574122ddd10d4fefc4416d\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"8D流程-D2投诉产品生产日期校验\",\n" +
                "            \"triggerType\": \"客户工单管理.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63553fdbddd10d4fefc4412b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"提交后状态变更\",\n" +
                "            \"triggerType\": \"\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63553c1addd10d4fefc44127\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取建议售价\",\n" +
                "            \"triggerType\": \"销售合同变更.字段值改变时\",\n" +
                "            \"executionEvent\": \"历史预测价格.查询数据,销售合同变更.分支节点,分支设置,分支设置,销售合同变更.分支节点,分支设置,分支设置,销售合同变更.字段赋值节点,销售合同变更.字段赋值节点,标准价预测.查询数据,销售合同变更.分支节点,分支设置,分支设置,销售合同变更.字段赋值节点,销售合同变更.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63550c87ddd10d4fefc44065\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"项目管理-数据提交时更新数据\",\n" +
                "            \"triggerType\": \"\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63550893ddd10d4fefc4404f\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"送样状态跟踪-新增数据后-推送项目信息\",\n" +
                "            \"triggerType\": \"送样状态跟踪.表单保存成功后触发\",\n" +
                "            \"executionEvent\": \"销售项目管理.更新项目管理,需求一览表.查询需求，赋值应用场景,销售项目管理.更新项目中需求信息,客户管理.查询客户信息,销售项目管理.更新客户信息\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6354fc3eddd10d4fefc44001\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"紧急发货-建议售价\",\n" +
                "            \"triggerType\": \"紧急发货申请.字段值改变时\",\n" +
                "            \"executionEvent\": \"价格预测.查询数据,紧急发货申请.分支节点,分支设置,分支设置,紧急发货申请.分支节点,分支设置,分支设置,紧急发货申请.字段赋值节点,紧急发货申请.字段赋值节点,标准价预测.查询数据,紧急发货申请.分支节点,分支设置,分支设置,紧急发货申请.字段赋值节点,紧急发货申请.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6354fb4bddd10d4fefc43ffb\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"需求分析变更归档到文档库\",\n" +
                "            \"triggerType\": \"需求变更.\",\n" +
                "            \"executionEvent\": \"文档库.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6354f976ddd10d4fefc43fe7\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"拜访记录报告归档到文档库\",\n" +
                "            \"triggerType\": \"拜访行为管理.表单保存或提交成功后触发\",\n" +
                "            \"executionEvent\": \"文档库.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6354f5e3ddd10d4fefc43fc3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"行业峰会报告归档到文档库\",\n" +
                "            \"triggerType\": \"行业峰会.\",\n" +
                "            \"executionEvent\": \"文档库.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6354f5d4ddd10d4fefc43fc1\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"个人月报出差开始时间校验\",\n" +
                "            \"triggerType\": \"个人月报.表单提交前\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6354f50dddd10d4fefc43fbd\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"开始时间校验\",\n" +
                "            \"triggerType\": \"个人周报.表单提交前\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6354f1d7ddd10d4fefc43f8d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"市场报告同步到文档库中\",\n" +
                "            \"triggerType\": \"市场报告.\",\n" +
                "            \"executionEvent\": \"文档库.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6354ad51ddd10d4fefc43e11\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"开票申请-获取当前客户合同物料-已开票数量\",\n" +
                "            \"triggerType\": \"开票申请.字段值改变时\",\n" +
                "            \"executionEvent\": \"开票明细-隐藏表单.查询数据,开票申请.字段赋值节点,计算数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6354aafeddd10d4fefc43def\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"框架协议提交后状态更改\",\n" +
                "            \"triggerType\": \"框架协议发起.表单保存或提交时\",\n" +
                "            \"executionEvent\": \"框架协议发起.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6353c5f0ddd10d4fefc43d9d\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"开票申请-获取SAP、CRM合同号、订单号\",\n" +
                "            \"triggerType\": \"开票申请.字段值改变\",\n" +
                "            \"executionEvent\": \"订单一览表.查询数据,开票申请.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6353a6d7ddd10d4fefc43d5b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"D7预防措施审批-提交前-校验客户报告提交时间\",\n" +
                "            \"triggerType\": \"客户工单管理.D7预防措施审批.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6353a630ddd10d4fefc43d59\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"D6执行确认-提交前-校验客户报告提交时间\",\n" +
                "            \"triggerType\": \"客户工单管理.D6执行确认.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6353a560ddd10d4fefc43d57\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"D5措施审批-校验客户报告提交时间\",\n" +
                "            \"triggerType\": \"客户工单管理.D5措施审批.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6353a377ddd10d4fefc43d55\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"D5提交措施-校验计划完成时间-晚于今天\",\n" +
                "            \"triggerType\": \"客户工单管理.D5措施信息填写.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63524b4d7a5de1243b4b3813\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"D5措施处理-进展校验\",\n" +
                "            \"triggerType\": \"客户工单管理.D5措施处理-责任人提交处理结果.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635244a87a5de1243b4b37df\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"销售询报价-建议售价查询\",\n" +
                "            \"triggerType\": \"销售询报价.字段值改变时\",\n" +
                "            \"executionEvent\": \"历史预测价格.查询数据,销售询报价.分支节点,分支设置,分支设置,销售询报价.分支节点,分支设置,分支设置,销售询报价.字段赋值节点,销售询报价.字段赋值节点,标准价预测.查询数据,销售询报价.分支节点,分支设置,分支设置,销售询报价.字段赋值节点,销售询报价.字段赋值节点,整合数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63523e817a5de1243b4b37cf\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"业务事件名称:D5措施信息提交-进展校验\",\n" +
                "            \"triggerType\": \"客户工单管理.D5措施信息填写.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6352344d7a5de1243b4b37a5\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"销售询报价-建议售价获取\",\n" +
                "            \"triggerType\": \"\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635233e37a5de1243b4b379f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"框架协议发起-物料库存信息获取\",\n" +
                "            \"triggerType\": \"框架协议发起.\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63520a447a5de1243b4b36e3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"清空生成工厂\",\n" +
                "            \"triggerType\": \"销售合同发起.字段值改变\",\n" +
                "            \"executionEvent\": \"销售合同发起.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635147897a5de1243b4b3619\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户工单管理-提交前-有效性赋值-空值\",\n" +
                "            \"triggerType\": \"\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635142c17a5de1243b4b35f9\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户工单管理-提交前-有效性赋值\",\n" +
                "            \"triggerType\": \"客户工单管理.表单提交前\",\n" +
                "            \"executionEvent\": \"客户工单管理.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635142307a5de1243b4b35f7\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户工单管理-新建时有效性判断\",\n" +
                "            \"triggerType\": \"\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63513b757a5de1243b4b35d9\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"新建时判断\",\n" +
                "            \"triggerType\": \"\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635134f67a5de1243b4b35bb\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"客户工单管理-提交前-校验\",\n" +
                "            \"triggerType\": \"客户工单管理.表单提交前\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635134e57a5de1243b4b35b9\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"销售合同发起-产品-建议售价获取\",\n" +
                "            \"triggerType\": \"销售合同发起.字段值改变时\",\n" +
                "            \"executionEvent\": \"历史预测价格.查询数据,销售合同发起.分支节点,分支设置,分支设置,标准价预测.查询数据,销售合同发起.分支节点,分支设置,分支设置,销售合同发起.字段赋值节点,销售合同发起.字段赋值节点,销售合同发起.分支节点,分支设置,分支设置,销售合同发起.字段赋值节点,销售合同发起.字段赋值节点,整合数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635133a37a5de1243b4b35b1\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户工单管理-无效\",\n" +
                "            \"triggerType\": \"客户工单管理.拒绝后\",\n" +
                "            \"executionEvent\": \"客户工单管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635131d27a5de1243b4b35ad\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户工单管理-客诉有效\",\n" +
                "            \"triggerType\": \"客户工单管理.同意后\",\n" +
                "            \"executionEvent\": \"客户工单管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63512edf7a5de1243b4b35a3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"销售合同变更-带出合同明细\",\n" +
                "            \"triggerType\": \"销售合同变更.字段值改变\",\n" +
                "            \"executionEvent\": \"销售合同发起.查询数据,销售合同变更.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63512c567a5de1243b4b358f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取部门人员月报\",\n" +
                "            \"triggerType\": \"部门月报.字段值改变时\",\n" +
                "            \"executionEvent\": \"个人月报—本月回款子表.查询数据,部门月报.字段赋值节点,部门月报.分支节点,分支设置,分支设置,刷新节点,数据校验,个人月报-本月销售子表.查询数据,部门月报.字段赋值节点,个人月报-本月项目子表.查询数据,部门月报.字段赋值节点,个人月报-本月项目子表.查询数据,部门月报.字段赋值节点,个人月报-下月回款子表.查询数据,部门月报.字段赋值节点,个人月报-下月销量子表.查询数据,部门月报.字段赋值节点,个人月报-下月项目子表.查询数据,部门月报.字段赋值节点,个人月报-出差计划.查询数据,部门月报.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"635122397a5de1243b4b3561\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"价格预测提交时状态更改\",\n" +
                "            \"triggerType\": \"价格预测.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"价格预测.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63510a497a5de1243b4b3505\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"VOC任务结果提交前校验进展\",\n" +
                "            \"triggerType\": \"客户工单管理.VOC任务负责人处理并提交任务结果.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6350eaa87a5de1243b4b346d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"赋值审批路径\",\n" +
                "            \"triggerType\": \"退换货申请.字段值改变时\",\n" +
                "            \"executionEvent\": \"退换货申请.分支节点,分支设置,分支设置,退换货申请.字段赋值节点,退换货申请.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6350e26e7a5de1243b4b33fd\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"内部满意度评价-提交后-更新总分至客户年度满意度调查问卷\",\n" +
                "            \"triggerType\": \"内部满意度评价.表单提交时\",\n" +
                "            \"executionEvent\": \"内部满意度评价.查询数据,客户年度满意度调查问卷.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6350dd867a5de1243b4b33cd\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"内部满意度评价-总分更改-评价等级赋值\",\n" +
                "            \"triggerType\": \"内部满意度评价.字段值改变时\",\n" +
                "            \"executionEvent\": \"内部满意度评价.分支节点,分支设置,分支设置,分支设置,分支设置,内部满意度评价.字段赋值节点,内部满意度评价.字段赋值节点,内部满意度评价.字段赋值节点,内部满意度评价.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6350c4fa7a5de1243b4b33a1\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"客户满意度调查问卷-新建提交后-打分为空\",\n" +
                "            \"triggerType\": \"客户年度满意度调查问卷.表单暂存后触发\",\n" +
                "            \"executionEvent\": \"客户年度满意度调查问卷.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6350b7dd7a5de1243b4b3335\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取部门人员周报信息\",\n" +
                "            \"triggerType\": \"部门周报.字段值改变\",\n" +
                "            \"executionEvent\": \"个人周报-本周回款子表.查询数据,部门周报.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634fe86a7a5de1243b4b323b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取已维护完成的公式信息\",\n" +
                "            \"triggerType\": \"价格公式维护.字段值改变时\",\n" +
                "            \"executionEvent\": \"价格公式维护.分支节点,分支设置,分支设置,价格公式预览.查询数据,价格公式维护.字段赋值节点,价格公式预览.查询数据,价格公式维护.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634fdeac7a5de1243b4b3215\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"当是标准价维护时赋值\",\n" +
                "            \"triggerType\": \"价格公式维护.字段值改变时\",\n" +
                "            \"executionEvent\": \"价格公式维护.分支节点,分支设置,分支设置,价格公式维护.字段赋值节点,价格公式维护.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634f4a8e7a5de1243b4b2e9b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"清空关联客户编码\",\n" +
                "            \"triggerType\": \"客户管理.字段值改变\",\n" +
                "            \"executionEvent\": \"客户管理.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634f43437a5de1243b4b2e6f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"分配潜在客户\",\n" +
                "            \"triggerType\": \"客户分配.表单保存或提交时\",\n" +
                "            \"executionEvent\": \"客户管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634ea1a87a5de1243b4b2e5d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"已过冷静期的客户回到客户公海中\",\n" +
                "            \"triggerType\": \"定时触发\",\n" +
                "            \"executionEvent\": \"客户管理.更新数据,客户管理.查询数据,外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e9b297a5de1243b4b2e45\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户等级信息返回到客户信息中\",\n" +
                "            \"triggerType\": \"客户等级评价表.进入节点前\",\n" +
                "            \"executionEvent\": \"客户管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e90c27a5de1243b4b2df5\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"批量申请额度提交后更改状态\",\n" +
                "            \"triggerType\": \"客户批量授信管理.表单保存或提交时\",\n" +
                "            \"executionEvent\": \"客户批量授信管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e906d7a5de1243b4b2df3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"简化类需求提报-研发需求不允许提交\",\n" +
                "            \"triggerType\": \"简化类需求提报.表单提交前\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e8d697a5de1243b4b2dcb\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"样品已签收\",\n" +
                "            \"triggerType\": \"送样状态跟踪.已签收\",\n" +
                "            \"executionEvent\": \"弹窗节点,送样状态跟踪.更新数据,刷新节点,测试结果跟进.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e8c1b7a5de1243b4b2dbb\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"内销/外销赋值\",\n" +
                "            \"triggerType\": \"信贷放行申请表.字段值改变时\",\n" +
                "            \"executionEvent\": \"信贷放行申请表.分支节点,分支设置,分支设置,信贷放行申请表.字段赋值节点,信贷放行申请表.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e88737a5de1243b4b2da3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"样品已寄送\",\n" +
                "            \"triggerType\": \"送样状态跟踪.已寄送\",\n" +
                "            \"executionEvent\": \"弹窗节点,整合数据,送样状态跟踪.更新数据,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e7aca7a5de1243b4b2d33\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"提交授信申请数据\",\n" +
                "            \"triggerType\": \"客户批量授信管理.表单暂存后触发\",\n" +
                "            \"executionEvent\": \"客户授信预览.提交数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e78d67a5de1243b4b2d2d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取客户信息\",\n" +
                "            \"triggerType\": \"客户批量授信管理.字段值改变时\",\n" +
                "            \"executionEvent\": \"客户管理.查询数据,客户批量授信管理.字段赋值节点,SAP付款条件.查询数据,整合数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e77697a5de1243b4b2d27\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"批量授信提交校验\",\n" +
                "            \"triggerType\": \"客户批量授信管理.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e6a937a5de1243b4b2ce9\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"赋值到相应部门\",\n" +
                "            \"triggerType\": \"客户管理.字段值改变时\",\n" +
                "            \"executionEvent\": \"客户管理.分支节点,分支设置,分支设置,分支设置,分支设置,分支设置,客户管理.字段赋值节点,客户管理.字段赋值节点,客户管理.字段赋值节点,客户管理.字段赋值节点,客户管理.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e66d47a5de1243b4b2cd3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"失效客户转为潜在客户\",\n" +
                "            \"triggerType\": \"客户管理.失效客户转潜在客户\",\n" +
                "            \"executionEvent\": \"弹窗节点,客户管理.更新数据,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e65cc7a5de1243b4b2cc3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"失效客户转交易客户\",\n" +
                "            \"triggerType\": \"客户管理.失效客户转交易客户\",\n" +
                "            \"executionEvent\": \"弹窗节点,客户管理.更新数据,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e5f427a5de1243b4b2c9d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户失效申请中\",\n" +
                "            \"triggerType\": \"客户失效审核.表单保存或提交时\",\n" +
                "            \"executionEvent\": \"客户管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e5e917a5de1243b4b2c97\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户失效成功\",\n" +
                "            \"triggerType\": \"客户失效审核.进入节点后\",\n" +
                "            \"executionEvent\": \"客户管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e5a2f7a5de1243b4b2c6f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户信息变更数据返回\",\n" +
                "            \"triggerType\": \"客户变更审核.销管.\",\n" +
                "            \"executionEvent\": \"客户管理.更新数据,外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e575b7a5de1243b4b2c5f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"将转交易客户补充的数据返回到客户管理中\",\n" +
                "            \"triggerType\": \"交易客户审核.表单保存或提交时\",\n" +
                "            \"executionEvent\": \"客户管理.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e55907a5de1243b4b2c43\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"转交易客户成功\",\n" +
                "            \"triggerType\": \"交易客户审核.销售管理.\",\n" +
                "            \"executionEvent\": \"客户管理.更新数据,客户组织结构.更新数据,交易客户审核.分支节点,分支设置,分支设置,外部节点,外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e529e7a5de1243b4b2c3b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"简化类需求通过-新增数据至需求池\",\n" +
                "            \"triggerType\": \"简化类需求提报.进入节点后\",\n" +
                "            \"executionEvent\": \"需求池.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e4ec77a5de1243b4b2c01\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"分发潜在客户\",\n" +
                "            \"triggerType\": \"客户管理.自定义按钮\",\n" +
                "            \"executionEvent\": \"客户分配.调用节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e4e207a5de1243b4b2be3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"关闭交易客户申请\",\n" +
                "            \"triggerType\": \"客户管理.转为失效客户\",\n" +
                "            \"executionEvent\": \"客户失效审核.调用节点,客户变更审核.查询数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e4c687a5de1243b4b2bd5\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"转为交易客户申请\",\n" +
                "            \"triggerType\": \"客户管理.转为交易客户\",\n" +
                "            \"executionEvent\": \"交易客户审核.调用节点,交易客户审核.查询数据,计算数据,数据校验,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e4a377a5de1243b4b2bb5\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"变更客户信息\",\n" +
                "            \"triggerType\": \"客户管理.信息变更\",\n" +
                "            \"executionEvent\": \"客户变更审核.调用节点,客户变更审核.查询数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e49427a5de1243b4b2b99\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"需求审批意见-纳入评审、持续关注-不可拒绝\",\n" +
                "            \"triggerType\": \"需求提报.需求评审-RAT团队人员.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e48f97a5de1243b4b2b97\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"客户分级\",\n" +
                "            \"triggerType\": \"信用账期评价申请表.字段值改变时\",\n" +
                "            \"executionEvent\": \"信用账期评价申请表.分支节点,分支设置,分支设置,分支设置,分支设置,信用账期评价申请表.字段赋值节点,信用账期评价申请表.字段赋值节点,信用账期评价申请表.字段赋值节点,信用账期评价申请表.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e48c37a5de1243b4b2b91\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"需求审批意见-驳回修改-不允许同意\",\n" +
                "            \"triggerType\": \"需求提报.需求评审-RAT团队人员.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e47f77a5de1243b4b2b8b\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"客户评价\",\n" +
                "            \"triggerType\": \"信用账期评价申请表.字段值改变时\",\n" +
                "            \"executionEvent\": \"信用账期评价申请表.分支节点,分支设置,分支设置,分支设置,分支设置,分支设置\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e46c27a5de1243b4b2b7f\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"研发类需求通过-推送数据至需求池\",\n" +
                "            \"triggerType\": \"研发类需求提报.同意后\",\n" +
                "            \"executionEvent\": \"需求池.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e43fc7a5de1243b4b2b67\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"新建账期评价时赋值评价规则\",\n" +
                "            \"triggerType\": \"信用账期评价申请表.表单新建或编辑时\",\n" +
                "            \"executionEvent\": \"信用账期评价标准维护.查询数据,信用账期评价申请表.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e43607a5de1243b4b2b5f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"权重不能超过或少于100\",\n" +
                "            \"triggerType\": \"信用账期评价标准维护.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"计算数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e43037a5de1243b4b2b5b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"权重不能超过100\",\n" +
                "            \"triggerType\": \"信用账期评价标准维护.字段值改变时\",\n" +
                "            \"executionEvent\": \"计算数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e416a7a5de1243b4b2b31\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"删除\",\n" +
                "            \"triggerType\": \"物料信息.表单按钮触发\",\n" +
                "            \"executionEvent\": \"物料信息.删除数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e3f237a5de1243b4b2b29\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"新建分级评价时赋值评价规则\",\n" +
                "            \"triggerType\": \"客户等级评价表.表单新建或编辑时\",\n" +
                "            \"executionEvent\": \"客户分级标准维护.查询数据,客户等级评价表.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e3cc47a5de1243b4b2b25\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"权重需达到100\",\n" +
                "            \"triggerType\": \"客户分级标准维护.表单保存或提交前\",\n" +
                "            \"executionEvent\": \"计算数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e3ae27a5de1243b4b2b0f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"校验权重不能超过100\",\n" +
                "            \"triggerType\": \"客户分级标准维护.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验,计算数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634e1fd57a5de1243b4b2ac3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"客户等级计算\",\n" +
                "            \"triggerType\": \"客户等级评价表.字段值改变时\",\n" +
                "            \"executionEvent\": \"客户等级评价表.分支节点,分支设置,分支设置,分支设置,分支设置,客户等级评价表.字段赋值节点,客户等级评价表.字段赋值节点,客户等级评价表.字段赋值节点,客户等级评价表.字段赋值节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634d4fb37a5de1243b4b296b\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"获取线索对应客户信息\",\n" +
                "            \"triggerType\": \"拜访行为管理.字段值改变\",\n" +
                "            \"executionEvent\": \"线索跟进.查询数据,拜访行为管理.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634cc8957a5de1243b4b2693\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"产品库-产品状态改变-提示语\",\n" +
                "            \"triggerType\": \"产品库.字段值改变时\",\n" +
                "            \"executionEvent\": \"数据校验,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634cc6627a5de1243b4b268f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"产品库信息保存-提醒\",\n" +
                "            \"triggerType\": \"产品库.表单保存前\",\n" +
                "            \"executionEvent\": \"弹窗节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"634cc42f7a5de1243b4b267b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"产品库信息新建-提醒\",\n" +
                "            \"triggerType\": \"产品库.表单提交前\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63369f9b7a5de1243b4b2471\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"创建新需求\",\n" +
                "            \"triggerType\": \"线索转需求审核.销售管理.\",\n" +
                "            \"executionEvent\": \"线索转需求审核.分支节点,分支设置,分支设置,简化类需求提报.新增数据,需求提报.新增数据,线索跟进.更新数据,线索池.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"633533ab7a5de1243b4b2439\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"创建计划\",\n" +
                "            \"triggerType\": \"线索跟进.表单按钮触发\",\n" +
                "            \"executionEvent\": \"跟进计划.调用节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"633530b97a5de1243b4b2431\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"线索跟进-新建计划\",\n" +
                "            \"triggerType\": \"线索跟进.自定义按钮\",\n" +
                "            \"executionEvent\": \"跟进计划.调用节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63340f487a5de1243b4b2401\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"线索转化需求\",\n" +
                "            \"triggerType\": \"线索跟进.转化需求\",\n" +
                "            \"executionEvent\": \"线索转需求审核.调用节点,刷新节点,跟进计划.查询数据,线索跟进.分支节点,分支设置,分支设置,弹窗节点,计算数据,跟进计划.更新数据,跟进计划.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"633402797a5de1243b4b23c7\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"线索关闭审核-更新线索状态\",\n" +
                "            \"triggerType\": \"线索关闭审核.同意后\",\n" +
                "            \"executionEvent\": \"线索跟进.关闭线索跟进,线索池.关闭线索,跟进计划.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6333fba07a5de1243b4b23a5\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"线索跟进-关闭线索\",\n" +
                "            \"triggerType\": \"线索跟进.关闭线索\",\n" +
                "            \"executionEvent\": \"线索关闭审核.调用节点,刷新节点,跟进计划.查询数据,计算数据,线索跟进.分支节点,分支设置,分支设置,弹窗节点,跟进计划.更新数据,跟进计划.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6332ba147a5de1243b4b2381\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"计划执行-查看\",\n" +
                "            \"triggerType\": \"计划执行.自定义按钮\",\n" +
                "            \"executionEvent\": \"计划执行.调用节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6332b7017a5de1243b4b237d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"更新计划状态\",\n" +
                "            \"triggerType\": \"计划执行更新.\",\n" +
                "            \"executionEvent\": \"计划执行更新.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6332b3ed7a5de1243b4b236f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"计划执行-完成任务\",\n" +
                "            \"triggerType\": \"跟进计划.完成任务\",\n" +
                "            \"executionEvent\": \"计划执行更新.调用节点,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6332a20e7a5de1243b4b2335\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"计划执行-取消任务\",\n" +
                "            \"triggerType\": \"跟进计划.取消任务\",\n" +
                "            \"executionEvent\": \"弹窗节点,跟进计划.更新数据,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63329f5e7a5de1243b4b2333\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"计划执行-完成任务\",\n" +
                "            \"triggerType\": \"跟进计划.完成任务-作废\",\n" +
                "            \"executionEvent\": \"跟进计划.分支节点,分支设置,分支设置,弹窗节点,弹窗节点,跟进计划.更新数据,整合数据,整合数据,跟进计划.更新数据,刷新节点,弹窗节点,计划执行更新.调用节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63329ea97a5de1243b4b2331\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"计划执行-开启任务\",\n" +
                "            \"triggerType\": \"跟进计划.开启任务\",\n" +
                "            \"executionEvent\": \"弹窗节点,整合数据,跟进计划.更新数据,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63329d907a5de1243b4b2329\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"线索跟踪-新建跟踪任务\",\n" +
                "            \"triggerType\": \"线索跟进.自定义按钮\",\n" +
                "            \"executionEvent\": \"线索跟进.调用节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63328fb07a5de1243b4b2321\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"取消任务状态更新\",\n" +
                "            \"triggerType\": \"计划执行.\",\n" +
                "            \"executionEvent\": \"计划执行.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63328f7c7a5de1243b4b231f\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"完成任务状态更新\",\n" +
                "            \"triggerType\": \"计划执行.同意后\",\n" +
                "            \"executionEvent\": \"计划执行.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63328f127a5de1243b4b231d\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"完成任务校验\",\n" +
                "            \"triggerType\": \"跟进计划.任务负责人.\",\n" +
                "            \"executionEvent\": \"数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"633259a47a5de1243b4b22c5\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"线索跟进-提交子表\",\n" +
                "            \"triggerType\": \"线索跟进.\",\n" +
                "            \"executionEvent\": \"计划执行.提交数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63324fbe7a5de1243b4b22bb\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"获取销售人员\",\n" +
                "            \"triggerType\": \"线索池.字段值改变\",\n" +
                "            \"executionEvent\": \"客户管理.查询数据,线索池.字段赋值\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63318e3a7a5de1243b4b2299\",\n" +
                "            \"status\": \"DISABLE\",\n" +
                "            \"eventName\": \"线索跟踪-提交子表\",\n" +
                "            \"triggerType\": \"跟进计划.表单保存或提交成功后触发\",\n" +
                "            \"executionEvent\": \"跟进计划.提交节点,弹窗节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"633181057a5de1243b4b226b\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"智能分配线索\",\n" +
                "            \"triggerType\": \"线索池.表单提交时\",\n" +
                "            \"executionEvent\": \"线索跟进.新增数据,线索池.更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63317bad7a5de1243b4b2265\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"销售跟进-更新线索池\",\n" +
                "            \"triggerType\": \"线索分发.同意后\",\n" +
                "            \"executionEvent\": \"线索池.更新数据,线索跟进.新增数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"633142517a5de1243b4b2229\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"分发线索\",\n" +
                "            \"triggerType\": \"线索池.线索分配\",\n" +
                "            \"executionEvent\": \"线索分发.调用节点,线索分发.查询数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"632d87ca7a5de1243b4b21f3\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"线索分配部门\",\n" +
                "            \"triggerType\": \"线索池.自定义按钮\",\n" +
                "            \"executionEvent\": \"线索跟踪.调用节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"632d634f7a5de1243b4b21cd\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"线索池-线索分发\",\n" +
                "            \"triggerType\": \"线索池.\",\n" +
                "            \"executionEvent\": \"弹窗节点,整合数据,线索跟进.新增数据,线索池.更新数据,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"632aad1c7a5de1243b4b2095\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"公海客户转交易客户\",\n" +
                "            \"triggerType\": \"公海客户.公海客户转交易客户\",\n" +
                "            \"executionEvent\": \"交易客户审核.调用节点,客户管理.查询数据,数据校验\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"632aa32c7a5de1243b4b2079\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"更新SAP物料基础数据/每天\",\n" +
                "            \"triggerType\": \"定时触发\",\n" +
                "            \"executionEvent\": \"外部节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"632a6bdf7a5de1243b4b2045\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"重置查询条件\",\n" +
                "            \"triggerType\": \"物料库存查询-隐藏.重置\",\n" +
                "            \"executionEvent\": \"刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6329db5f7a5de1243b4b2029\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"查询物料库存信息\",\n" +
                "            \"triggerType\": \"物料库存查询-隐藏.查询\",\n" +
                "            \"executionEvent\": \"外部节点,物料库存查询-隐藏.分支节点,分支设置,分支设置,物料库存查询-隐藏.字段赋值节点,弹窗节点,刷新节点\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6322e55512dfe6516eb38b0c\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"更新物料基础数据\",\n" +
                "            \"triggerType\": \"外部节点触发\",\n" +
                "            \"executionEvent\": \"更新数据\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6322e54212dfe6516eb38b0a\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"更新物料基础数据\",\n" +
                "            \"triggerType\": \"\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63197cad12dfe6516eb388b4\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"3\",\n" +
                "            \"triggerType\": \"\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"63197c7a12dfe6516eb388b2\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"1\",\n" +
                "            \"triggerType\": \"\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"eventId\": \"6319504e12dfe6516eb38890\",\n" +
                "            \"status\": \"ENABLE\",\n" +
                "            \"eventName\": \"创建根节点\",\n" +
                "            \"triggerType\": \"\",\n" +
                "            \"executionEvent\": \"\",\n" +
                "            \"version\": \"v2.0\",\n" +
                "            \"intactFlag\": false\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        String s2 = s + s1;
        JSONArray data = JSONObject.parseObject(s2).getJSONArray("table");

        String s3 = "{\"code\":\"ok\",\"message\":\"操作成功\",\"total\":322,\"table\":[{\"eventId\":\"63d860fe919ae2676b7db9c6\",\"status\":\"ENABLE\",\"eventName\":\"销售合同发起-选择物料-赋值建议售价\",\"triggerType\":\"销售合同发起.字段值改变时\",\"executionEvent\":\"历史预测价格.查询数据,销售合同发起.分支节点,分支设置,分支设置,销售合同发起.分支节点,分支设置,分支设置,销售合同发起.字段赋值节点,销售合同发起.字段赋值节点,标准价预测.查询数据,整合数据,销售合同发起.分支节点,分支设置,分支设置,销售合同发起.字段赋值节点,销售合同发起.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63aead8591b777738d22205d\",\"status\":\"ENABLE\",\"eventName\":\"提交授信申请数据\",\"triggerType\":\"客户批量授信管理.表单暂存后触发\",\"executionEvent\":\"客户授信预览.提交节点,外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63ae84d591b777738d222043\",\"status\":\"ENABLE\",\"eventName\":\"交付数量大于下单数量时不可提交\",\"triggerType\":\"逾期合同继续执行申请.表单保存或提交前\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63ae82ce91b777738d22203f\",\"status\":\"ENABLE\",\"eventName\":\"交付数量大于下单数量时提醒\",\"triggerType\":\"逾期合同继续执行申请.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63ae4f9991b777738d222033\",\"status\":\"ENABLE\",\"eventName\":\"获取销售合同物料信息\",\"triggerType\":\"逾期合同继续执行申请.字段值改变\",\"executionEvent\":\"销售合同发起.查询数据,逾期合同继续执行申请.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63a93d05ae1aee15ecc29e4d\",\"status\":\"ENABLE\",\"eventName\":\"测试解密下载\",\"triggerType\":\"\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"63993dc88496f757685f9912\",\"status\":\"ENABLE\",\"eventName\":\"汇率变更时计算物料的不含税单价\",\"triggerType\":\"销售合同发起.字段值改变\",\"executionEvent\":\"销售合同发起.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6397ea3583300731d0d8dcbb\",\"status\":\"ENABLE\",\"eventName\":\"业务事件赋值测试\",\"triggerType\":\"测试业务事件赋值.字段值改变\",\"executionEvent\":\"测试业务事件赋值.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"639681b683a25c574d415a5b\",\"status\":\"ENABLE\",\"eventName\":\"授信额度提交后编码同步到一览表中（提交后）\",\"triggerType\":\"客户批量授信管理.表单保存或提交时\",\"executionEvent\":\"客户批量授信管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6392a24060767f29acd4b438\",\"status\":\"ENABLE\",\"eventName\":\"删除批量授信时删除我的待办中审批数据\",\"triggerType\":\"客户批量授信管理.表单删除前\",\"executionEvent\":\"外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"639190e760767f29acd4b3e2\",\"status\":\"DISABLE\",\"eventName\":\"测试\",\"triggerType\":\"线索转需求审核.表单保存成功后触发\",\"executionEvent\":\"需求提报.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"639190ac60767f29acd4b3e0\",\"status\":\"ENABLE\",\"eventName\":\"测试\",\"triggerType\":\"\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"639083a9c2e40f3e59b4be6d\",\"status\":\"ENABLE\",\"eventName\":\"小组成员id-自动带出小组成员信息\",\"triggerType\":\"客户工单管理.字段值改变\",\"executionEvent\":\"客户工单管理.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6390537a322ceb1ed3b2ea3c\",\"status\":\"ENABLE\",\"eventName\":\"将研发经理人员ID转化为人员信息\",\"triggerType\":\"送样申请.字段值改变\",\"executionEvent\":\"送样申请.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"639052e2322ceb1ed3b2ea30\",\"status\":\"ENABLE\",\"eventName\":\"将工厂技术人员ID转化为人员信息\",\"triggerType\":\"送样申请.字段值改变\",\"executionEvent\":\"送样申请.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"638f1f85322ceb1ed3b2e9f4\",\"status\":\"ENABLE\",\"eventName\":\"新增客户时校验销售视图是否无误\",\"triggerType\":\"交易客户审核.销售管理.\",\"executionEvent\":\"客户管理.查询数据,交易客户审核.分支节点,分支设置,分支设置,外部节点,外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"638f1811322ceb1ed3b2e9f2\",\"status\":\"ENABLE\",\"eventName\":\"客户变更时校验销售视图是否无误\",\"triggerType\":\"客户变更审核.销管.\",\"executionEvent\":\"外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"638ed14e322ceb1ed3b2e984\",\"status\":\"ENABLE\",\"eventName\":\"客户变更提交时校验客户信息是否正确\",\"triggerType\":\"客户变更审核.表单保存或提交前\",\"executionEvent\":\"外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"638eb3b0322ceb1ed3b2e97e\",\"status\":\"ENABLE\",\"eventName\":\"新建客户时检验客户信息\",\"triggerType\":\"交易客户审核.表单提交前\",\"executionEvent\":\"客户管理.查询数据,交易客户审核.分支节点,分支设置,分支设置,外部节点,外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"638d6b55322ceb1ed3b2e8de\",\"status\":\"ENABLE\",\"eventName\":\"同步人员工号\",\"triggerType\":\"定时触发\",\"executionEvent\":\"外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"638d69ad322ceb1ed3b2e8d6\",\"status\":\"ENABLE\",\"eventName\":\"同步部门人员\",\"triggerType\":\"定时触发\",\"executionEvent\":\"外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6389d286322ceb1ed3b2e896\",\"status\":\"ENABLE\",\"eventName\":\"市场报告提交时生成待阅数据\",\"triggerType\":\"市场报告.表单提交时\",\"executionEvent\":\"外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"638855e9c20c4a1301cd19cd\",\"status\":\"ENABLE\",\"eventName\":\"判断价格是否低于建议售价98%\",\"triggerType\":\"销售合同变更.表单保存或提交前\",\"executionEvent\":\"销售合同变更.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"638854d8322ceb1ed3b2e864\",\"status\":\"ENABLE\",\"eventName\":\"判断是否低于建议售价的98%\",\"triggerType\":\"销售合同变更.表单保存或提交前\",\"executionEvent\":\"销售合同变更.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6385e0ff322ceb1ed3b2e7b8\",\"status\":\"ENABLE\",\"eventName\":\"回款目标-每天定时更新\",\"triggerType\":\"定时触发\",\"executionEvent\":\"外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6385d1d2322ceb1ed3b2e7a4\",\"status\":\"ENABLE\",\"eventName\":\"回款目标-同步SAP系统数据\",\"triggerType\":\"回款目标.同步回款数据\",\"executionEvent\":\"外部节点,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6385b796322ceb1ed3b2e746\",\"status\":\"ENABLE\",\"eventName\":\"默认汇率\",\"triggerType\":\"信贷放行申请表.表单新建时\",\"executionEvent\":\"美元汇率维护.查询数据,信贷放行申请表.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6385a418322ceb1ed3b2e738\",\"status\":\"ENABLE\",\"eventName\":\"删除所有数据\",\"triggerType\":\"订单一览表.删除\",\"executionEvent\":\"订单一览表.删除数据,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63849381322ceb1ed3b2e710\",\"status\":\"ENABLE\",\"eventName\":\"获取SAP系统内回款目标数据\",\"triggerType\":\"回款目标.同步回款目标数据\",\"executionEvent\":\"外部节点,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63844d6c322ceb1ed3b2e6b8\",\"status\":\"ENABLE\",\"eventName\":\"研发类需求-同意后推送文档数据至文档库\",\"triggerType\":\"需求提报.同意后\",\"executionEvent\":\"文档库.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6380500344c5ed4b50b4049e\",\"status\":\"ENABLE\",\"eventName\":\"提交时将上级部门的客户编码带出\",\"triggerType\":\"客户组织结构.表单提交前\",\"executionEvent\":\"客户组织结构.查询数据,客户组织结构.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63801a5944c5ed4b50b40472\",\"status\":\"ENABLE\",\"eventName\":\"获取紧急发货信息\",\"triggerType\":\"销售合同发起.字段值改变\",\"executionEvent\":\"紧急发货申请.查询数据,销售合同发起.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637f4ae344c5ed4b50b4042c\",\"status\":\"ENABLE\",\"eventName\":\"销售合同发起测试\",\"triggerType\":\"销售合同发起测试.字段值改变\",\"executionEvent\":\"销售合同发起测试.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637f46c744c5ed4b50b4040e\",\"status\":\"ENABLE\",\"eventName\":\"获取SAP应收数据\",\"triggerType\":\"定时触发\",\"executionEvent\":\"外部节点,应收一览表.查询数据,计算数据,客户管理.更新数据,客户管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637f432844c5ed4b50b40406\",\"status\":\"ENABLE\",\"eventName\":\"变更状态\",\"triggerType\":\"价格预测.自定义按钮\",\"executionEvent\":\"价格预测.查询数据,价格预测.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637e043d28069d2fe4305393\",\"status\":\"ENABLE\",\"eventName\":\"跟进部门赋值\",\"triggerType\":\"线索分发.同意后\",\"executionEvent\":\"线索池.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637dd1be28069d2fe4305377\",\"status\":\"ENABLE\",\"eventName\":\"查询sap应收总额\",\"triggerType\":\"应收一览表.\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"637dc75028069d2fe4305353\",\"status\":\"ENABLE\",\"eventName\":\"将交易客户推送到SAP系统\",\"triggerType\":\"客户管理.推送SAP系统\",\"executionEvent\":\"外部节点,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637dc41428069d2fe4305343\",\"status\":\"ENABLE\",\"eventName\":\"将销售组织赋值到公司代码中\",\"triggerType\":\"交易客户审核.字段值改变\",\"executionEvent\":\"交易客户审核.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637dc11828069d2fe4305331\",\"status\":\"ENABLE\",\"eventName\":\"将销售组织编码赋值到公司代码中\",\"triggerType\":\"客户变更审核.字段值改变\",\"executionEvent\":\"客户变更审核.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637d940628069d2fe430530d\",\"status\":\"ENABLE\",\"eventName\":\"变更销售组织以及公司代码信息\",\"triggerType\":\"客户管理.变更销售组织信息\",\"executionEvent\":\"弹窗节点,外部节点,整合数据,刷新节点,外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637d898b28069d2fe430530b\",\"status\":\"ENABLE\",\"eventName\":\"获取海波龙的产品成本价\",\"triggerType\":\"定时触发\",\"executionEvent\":\"外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637d88a628069d2fe4305305\",\"status\":\"ENABLE\",\"eventName\":\"客户送达方地址修改后推送给SAP系统\",\"triggerType\":\"客户地址信息.表单保存时\",\"executionEvent\":\"客户管理.查询数据,客户地址信息.分支节点,分支设置,分支设置,外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637d84dc28069d2fe4305303\",\"status\":\"ENABLE\",\"eventName\":\"客户送达方地址新建推送SAP系统\",\"triggerType\":\"客户地址信息.表单提交时\",\"executionEvent\":\"客户管理.查询数据,客户地址信息.分支节点,分支设置,分支设置,外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637ca35a28069d2fe4305243\",\"status\":\"ENABLE\",\"eventName\":\"选择送样工厂-赋值对应样品寄送人\",\"triggerType\":\"送样状态跟踪.字段值改变时\",\"executionEvent\":\"送样状态跟踪.分支节点,分支设置,分支设置,SAP工厂信息.查询数据,送样状态跟踪.字段赋值节点,送样状态跟踪.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637c8b5e28069d2fe430521d\",\"status\":\"ENABLE\",\"eventName\":\"紧急发货-是否低于建议售价98%\",\"triggerType\":\"紧急发货申请.表单保存或提交前\",\"executionEvent\":\"紧急发货申请.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637c811528069d2fe43051ef\",\"status\":\"ENABLE\",\"eventName\":\"紧急发货中获取美元汇率\",\"triggerType\":\"紧急发货申请.表单新建时\",\"executionEvent\":\"美元汇率维护.查询数据,紧急发货申请.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637c7eea28069d2fe43051e5\",\"status\":\"ENABLE\",\"eventName\":\"获取美元的汇率\",\"triggerType\":\"销售询报价.表单新建时\",\"executionEvent\":\"美元汇率维护.查询数据,销售询报价.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637c622b28069d2fe43051ab\",\"status\":\"ENABLE\",\"eventName\":\"客户变更时计算物料的不含税单价\",\"triggerType\":\"销售合同发起.字段值改变时\",\"executionEvent\":\"销售合同发起.分支节点,分支设置,分支设置,销售合同发起.字段赋值节点,销售合同发起.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637c60fb28069d2fe4305195\",\"status\":\"ENABLE\",\"eventName\":\"计算国内客户不含税单价\",\"triggerType\":\"销售合同发起.字段值改变\",\"executionEvent\":\"销售合同发起.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637c5fdb28069d2fe430518f\",\"status\":\"ENABLE\",\"eventName\":\"实际价格变更时计算物料的不含税单价\",\"triggerType\":\"销售合同发起.字段值改变时\",\"executionEvent\":\"销售合同发起.分支节点,分支设置,分支设置,销售合同发起.字段赋值节点,销售合同发起.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637c5c6628069d2fe4305189\",\"status\":\"ENABLE\",\"eventName\":\"获取物料组的产品成本\",\"triggerType\":\"销售合同发起.字段值改变\",\"executionEvent\":\"产品成本价格表.查询数据,销售合同发起.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637c3f9828069d2fe430517f\",\"status\":\"ENABLE\",\"eventName\":\"定时更新客户的授信数据\",\"triggerType\":\"定时触发\",\"executionEvent\":\"客户管理.查询数据,应收一览表.查询数据,计算数据,客户管理.更新数据,客户管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637ae50728069d2fe4305019\",\"status\":\"ENABLE\",\"eventName\":\"需求编辑保存-校验需求审批意见\",\"triggerType\":\"需求提报.表单保存前\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63774eec28069d2fe4304fb9\",\"status\":\"ENABLE\",\"eventName\":\"季度审批失败后将状态和时间同步到授信一览表中\",\"triggerType\":\"外部节点触发\",\"executionEvent\":\"客户授信预览.更新数据,客户批量授信管理.查询数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63774d9e28069d2fe4304fad\",\"status\":\"ENABLE\",\"eventName\":\"授信额度提交后编码同步到一览表中\",\"triggerType\":\"客户批量授信管理.表单暂存后触发\",\"executionEvent\":\"客户批量授信管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63774be128069d2fe4304fa5\",\"status\":\"ENABLE\",\"eventName\":\"季度审批通过后将状态和时间同步到授信一览表并将数据返回客户管理中\",\"triggerType\":\"外部节点触发\",\"executionEvent\":\"客户授信预览.更新数据,客户批量授信管理.查询数据,客户管理.更新数据,客户管理.更新数据,外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6377450d28069d2fe4304fa3\",\"status\":\"ENABLE\",\"eventName\":\"获取最新的美元汇率\",\"triggerType\":\"销售合同发起.表单新建时\",\"executionEvent\":\"美元汇率维护.查询数据,销售合同发起.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63773a2e28069d2fe4304f9b\",\"status\":\"ENABLE\",\"eventName\":\"打开新建跟进页面\",\"triggerType\":\"线索跟进.新建跟进内容\",\"executionEvent\":\"线索跟进记录.调用节点,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637736c228069d2fe4304f81\",\"status\":\"DISABLE\",\"eventName\":\"样品送样类-转化研发类需求\",\"triggerType\":\"简化类需求提报.自定义按钮\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6377164228069d2fe4304f4b\",\"status\":\"ENABLE\",\"eventName\":\"合同终止通过后将状态推送到合同一览表中，或合同变更后需将合同附件\",\"triggerType\":\"外部节点触发\",\"executionEvent\":\"销售合同变更.查询数据,分支节点,分支设置,分支设置,文档库.更新数据,合同一览表.更新数据,销售合同发起.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6376fc5928069d2fe4304f45\",\"status\":\"ENABLE\",\"eventName\":\"批量价格审批失败后状态同步到价格预测中\",\"triggerType\":\"外部节点触发\",\"executionEvent\":\"价格预测批量审批.查询数据,价格预测.查询数据,整合数据,价格预测.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6376f51e28069d2fe4304f3f\",\"status\":\"ENABLE\",\"eventName\":\"批量价格审批成功后状态同步到价格预测中\",\"triggerType\":\"外部节点触发\",\"executionEvent\":\"价格预测.更新数据,价格预测批量审批.查询数据,价格预测.查询数据,整合数据,外部节点,历史预测价格.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6376eed628069d2fe4304f17\",\"status\":\"ENABLE\",\"eventName\":\"销量目标-签收量获取\",\"triggerType\":\"定时触发\",\"executionEvent\":\"外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6376e10a28069d2fe4304f05\",\"status\":\"ENABLE\",\"eventName\":\"特殊额度同意后同步到客户主数据\",\"triggerType\":\"外部节点触发\",\"executionEvent\":\"客户特殊授信申请表.查询数据,分支节点,分支设置,分支设置,分支设置,客户管理.更新数据,客户管理.更新数据,客户管理.更新数据,外部节点,外部节点,外部节点,外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6376df1c28069d2fe4304f01\",\"status\":\"ENABLE\",\"eventName\":\"技术/质量协议审批通过后文件归档\",\"triggerType\":\"外部节点触发\",\"executionEvent\":\"技术/质量协议发起.查询数据,文档库.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6376dda828069d2fe4304eff\",\"status\":\"ENABLE\",\"eventName\":\"框架协议审批通过后文件归档\",\"triggerType\":\"外部节点触发\",\"executionEvent\":\"文档库.新增数据,框架协议发起.查询数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6376dbe428069d2fe4304efb\",\"status\":\"ENABLE\",\"eventName\":\"补录紧急发货流程状态更改\",\"triggerType\":\"销售合同发起.表单保存或提交时\",\"executionEvent\":\"紧急发货申请.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6376d94928069d2fe4304ef1\",\"status\":\"ENABLE\",\"eventName\":\"销售合同被拒绝后数据同步\",\"triggerType\":\"外部节点触发\",\"executionEvent\":\"销售合同发起.查询数据,分支节点,分支设置,分支设置,紧急发货申请.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6375a193c63a1918031faf57\",\"status\":\"ENABLE\",\"eventName\":\"删除全部数据\",\"triggerType\":\"合同一览表.自定义按钮\",\"executionEvent\":\"合同一览表.删除数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63759454c63a1918031faf4d\",\"status\":\"ENABLE\",\"eventName\":\"销售合同审批通过后数据推送\",\"triggerType\":\"外部节点触发\",\"executionEvent\":\"外部节点,销售合同-物料子表.查询数据,产品历史价格.更新数据,产品历史价格详细.新增数据,销售合同发起.查询数据,分支节点,分支设置,分支设置,合同回签.新增数据,合同回签.新增数据,文档库.更新数据,合同一览表.新增数据,销售合同发起.查询数据,整合数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63758e41c63a1918031faf45\",\"status\":\"ENABLE\",\"eventName\":\"合同提交前推送到SAP进行审批\",\"triggerType\":\"销售合同发起.表单保存或提交前\",\"executionEvent\":\"外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6374d6fcc63a1918031faf2f\",\"status\":\"ENABLE\",\"eventName\":\"同步SAP系统中订单信息\",\"triggerType\":\"定时触发\",\"executionEvent\":\"外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63744009c63a1918031fae93\",\"status\":\"ENABLE\",\"eventName\":\"对账后，对账状态更改为已对账\",\"triggerType\":\"对账提醒.同意后\",\"executionEvent\":\"对账提醒.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63736794c63a1918031fae07\",\"status\":\"ENABLE\",\"eventName\":\"获取客户约定预测价格\",\"triggerType\":\"价格预测.更新预测价格数据\",\"executionEvent\":\"弹窗节点,价格预测.查询数据,整合数据,外部节点,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63735828c63a1918031fadff\",\"status\":\"ENABLE\",\"eventName\":\"部门周报提交二次校验\",\"triggerType\":\"部门周报.表单提交前\",\"executionEvent\":\"弹窗节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637355f8c63a1918031fade9\",\"status\":\"ENABLE\",\"eventName\":\"个人月报提交二次校验\",\"triggerType\":\"个人月报.表单提交前\",\"executionEvent\":\"弹窗节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6373556bc63a1918031fade7\",\"status\":\"ENABLE\",\"eventName\":\"个人周报提交二次校验\",\"triggerType\":\"个人周报.表单提交前\",\"executionEvent\":\"弹窗节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63734fe1c63a1918031fadc7\",\"status\":\"ENABLE\",\"eventName\":\"送样申请通过-同步跟踪、项目信息\",\"triggerType\":\"外部节点触发\",\"executionEvent\":\"送样申请.查询数据,送样状态跟踪.新增数据,送样状态跟踪.查询数据,销售项目管理.更新数据,需求提报.查询数据,销售项目管理.更新数据,客户管理.查询数据,销售项目管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"637347e7c63a1918031fad8b\",\"status\":\"ENABLE\",\"eventName\":\"获取标准价格预测数据\",\"triggerType\":\"标准价预测.更新预测价格\",\"executionEvent\":\"弹窗节点,标准价预测.查询数据,整合数据,外部节点,整合数据,标准价预测.更新数据,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6372fce7c63a1918031fad09\",\"status\":\"DISABLE\",\"eventName\":\"客户视图信息自动带出\",\"triggerType\":\"交易客户审核.表单新建或编辑时\",\"executionEvent\":\"交易客户审核.分支节点,分支设置,分支设置,交易客户审核.字段赋值节点,交易客户审核.字段赋值节点,用于获取客户视图信息.查询数据,用于获取客户视图信息.查询数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6372f8e5c63a1918031facf1\",\"status\":\"ENABLE\",\"eventName\":\"合同有效性校验\",\"triggerType\":\"\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"637216fec63a1918031facab\",\"status\":\"ENABLE\",\"eventName\":\"价格公式推送到价格预测以及标准价预测表中\",\"triggerType\":\"外部节点触发\",\"executionEvent\":\"分支节点,分支设置,分支设置,价格公式维护.查询数据,价格公式预览.更新数据,价格公式预览.更新数据,外部节点,整合数据,标准价预测.更新数据,外部节点,价格预测.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63720e27c63a1918031faca3\",\"status\":\"ENABLE\",\"eventName\":\"赋值网址\",\"triggerType\":\"原材料价格维护.网址\",\"executionEvent\":\"原材料价格维护.更新数据,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63720d30c63a1918031fac9d\",\"status\":\"ENABLE\",\"eventName\":\"赋值网址\",\"triggerType\":\"原材料价格维护.\",\"executionEvent\":\"原材料价格维护.更新数据,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63720352c63a1918031fac8f\",\"status\":\"ENABLE\",\"eventName\":\"赋值网址\",\"triggerType\":\"原材料价格维护.自定义按钮\",\"executionEvent\":\"原材料价格维护.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6371f5e9c63a1918031fac6b\",\"status\":\"ENABLE\",\"eventName\":\"测试导出功能\",\"triggerType\":\"webhook解析测试.\",\"executionEvent\":\"自定义节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6371ef43c63a1918031fac65\",\"status\":\"DISABLE\",\"eventName\":\"合同终止或变更唯一性校验\",\"triggerType\":\"销售合同变更.表单保存或提交前\",\"executionEvent\":\"数据校验,销售合同变更.查询数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6371d1a9c63a1918031fab9f\",\"status\":\"ENABLE\",\"eventName\":\"赋值销售经理确认合同总金额（CNY）\",\"triggerType\":\"销售合同变更.字段值改变时\",\"executionEvent\":\"销售合同变更.分支节点,分支设置,分支设置,销售合同变更.字段赋值节点,销售合同变更.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6371996ec63a1918031faaad\",\"status\":\"ENABLE\",\"eventName\":\"获取销售经理确认合同总金额（CNY）数据\",\"triggerType\":\"紧急发货申请.字段值改变时\",\"executionEvent\":\"紧急发货申请.分支节点,分支设置,分支设置,紧急发货申请.字段赋值节点,紧急发货申请.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636f97bfc63a1918031faa5b\",\"status\":\"ENABLE\",\"eventName\":\"默认质量协议合同的产品组\",\"triggerType\":\"技术/质量协议发起.表单新建时\",\"executionEvent\":\"技术/质量协议发起.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636f958fc63a1918031faa51\",\"status\":\"ENABLE\",\"eventName\":\"默认框架协议的产品组\",\"triggerType\":\"框架协议发起.表单新建时\",\"executionEvent\":\"框架协议发起.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636f8f26c63a1918031faa2f\",\"status\":\"DISABLE\",\"eventName\":\"销量预测-提交、保存前唯一性校验\",\"triggerType\":\"销量预测.表单提交前\",\"executionEvent\":\"销量预测.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636f8e6dc63a1918031faa25\",\"status\":\"DISABLE\",\"eventName\":\"销量预测-暂存前唯一性校验\",\"triggerType\":\"销量预测.表单暂存前触发\",\"executionEvent\":\"销量预测.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636f87cec63a1918031faa19\",\"status\":\"ENABLE\",\"eventName\":\"价格公式的唯一性确认\",\"triggerType\":\"价格公式维护.表单保存或提交前\",\"executionEvent\":\"价格公式维护.分支节点,分支设置,分支设置,数据校验,价格公式维护.查询数据,价格公式维护.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636f6208c63a1918031fa96d\",\"status\":\"ENABLE\",\"eventName\":\"更改对账规则后-判断字段为空\",\"triggerType\":\"对账规则.表单提交成功后触发\",\"executionEvent\":\"对账规则.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636f61c5c63a1918031fa96b\",\"status\":\"DISABLE\",\"eventName\":\"价格预测数据不能为空\",\"triggerType\":\"价格预测.表单保存或提交前\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636f6128c63a1918031fa967\",\"status\":\"ENABLE\",\"eventName\":\"标准价格预测数据不能为空\",\"triggerType\":\"标准价预测.表单保存或提交前\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636f6113c63a1918031fa965\",\"status\":\"ENABLE\",\"eventName\":\"月底清空对账规则中的判断字段\",\"triggerType\":\"定时触发\",\"executionEvent\":\"对账规则.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636f542ac63a1918031fa909\",\"status\":\"ENABLE\",\"eventName\":\"获取客户约定价格预测数据\",\"triggerType\":\"价格预测.获取预测价格\",\"executionEvent\":\"价格公式预览.查询数据,价格预测.分支节点,分支设置,分支设置,外部节点,外部节点,价格预测.字段赋值节点,价格预测.字段赋值节点,计算数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636f3576c63a1918031fa8b7\",\"status\":\"ENABLE\",\"eventName\":\"每天更新对账规则表单中-当前日期所属天数字段\",\"triggerType\":\"定时触发\",\"executionEvent\":\"对账规则.查询数据,对账提醒.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636f20c3c63a1918031fa861\",\"status\":\"ENABLE\",\"eventName\":\"定时获取SRM系统的原材料预测价格信息\",\"triggerType\":\"定时触发\",\"executionEvent\":\"外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636e10f4c63a1918031fa80f\",\"status\":\"ENABLE\",\"eventName\":\"同意后，开票状态更新为已完成\",\"triggerType\":\"开票申请.工厂财务.\",\"executionEvent\":\"开票明细-隐藏表单.更新数据,客户管理.查询数据,开票申请.分支节点,分支设置,分支设置,计算数据,开票明细-隐藏表单.查询数据,合同一览表.更新数据,合同一览表.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636e0855c63a1918031fa7f3\",\"status\":\"ENABLE\",\"eventName\":\"获取询报价总额（CNY）\",\"triggerType\":\"销售询报价.字段值改变时\",\"executionEvent\":\"销售询报价.分支节点,分支设置,分支设置,销售询报价.字段赋值节点,销售询报价.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636e06b7c63a1918031fa7eb\",\"status\":\"ENABLE\",\"eventName\":\"销售询报价新建时默认产品组\",\"triggerType\":\"销售询报价.表单新建时\",\"executionEvent\":\"销售询报价.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636e0030c63a1918031fa7d3\",\"status\":\"ENABLE\",\"eventName\":\"赋值销售经理确认金额（CNY）\",\"triggerType\":\"销售合同发起.字段值改变时\",\"executionEvent\":\"销售合同发起.分支节点,分支设置,分支设置,销售合同发起.字段赋值节点,销售合同发起.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636ddd53c63a1918031fa78f\",\"status\":\"DISABLE\",\"eventName\":\"D4填写同意前-校验纳期晚于今天\",\"triggerType\":\"客户工单管理.D4信息填写.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636dbf7dc63a1918031fa785\",\"status\":\"ENABLE\",\"eventName\":\"提交后-客户报告至文档库\",\"triggerType\":\"客户工单管理.同意后\",\"executionEvent\":\"文档库.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636ce8bdc63a1918031fa6e1\",\"status\":\"ENABLE\",\"eventName\":\"测试导入功能\",\"triggerType\":\"webhook解析测试.\",\"executionEvent\":\"弹窗节点,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636cd90dc63a1918031fa6d3\",\"status\":\"ENABLE\",\"eventName\":\"同意前-赋值CQE负责人\",\"triggerType\":\"客户工单管理.同意前\",\"executionEvent\":\"客户工单管理.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636c9046c63a1918031fa681\",\"status\":\"ENABLE\",\"eventName\":\"产品类型去重-赋值产品类型下拉框数据字典\",\"triggerType\":\"送样申请.字段值改变时\",\"executionEvent\":\"送样申请.分支节点,分支设置,分支设置,分支设置,送样申请.字段赋值节点,送样申请.字段赋值节点,送样申请.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636c641dc63a1918031fa64b\",\"status\":\"ENABLE\",\"eventName\":\"获取子表单价是否低于建议售价的98%\",\"triggerType\":\"销售合同发起.表单保存或提交前\",\"executionEvent\":\"销售合同发起.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636b638ac63a1918031fa605\",\"status\":\"ENABLE\",\"eventName\":\"销量预测-新增销量目标\",\"triggerType\":\"销量预测.表单提交时\",\"executionEvent\":\"销量目标.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636b536fc63a1918031fa5d1\",\"status\":\"ENABLE\",\"eventName\":\"审批提交前，校验变更评审状态\",\"triggerType\":\"需求变更.变更评审意见反馈.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636a095bc63a1918031fa51d\",\"status\":\"ENABLE\",\"eventName\":\"数据推送到预览表\",\"triggerType\":\"价格公式维护.数据推送到预览表\",\"executionEvent\":\"价格公式预览.更新数据,价格公式维护.更新数据,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6369c7a2c63a1918031fa4e5\",\"status\":\"ENABLE\",\"eventName\":\"清空失效客户的客户经理数据\",\"triggerType\":\"客户管理.清空失效客户的客户经理数据\",\"executionEvent\":\"客户管理.更新数据,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6369029fc63a1918031fa4cf\",\"status\":\"ENABLE\",\"eventName\":\"订单数据同步到合同中\",\"triggerType\":\"定时触发\",\"executionEvent\":\"合同一览表.查询数据,订单一览表.查询数据,销售合同发起.查询数据,合同一览表.更新数据,分支节点,分支设置,分支设置,计算数据,分支节点,分支设置,分支设置,合同一览表.更新数据,合同一览表.更新数据,合同一览表.更新数据,合同一览表.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63690095c63a1918031fa4cd\",\"status\":\"ENABLE\",\"eventName\":\"D4拒绝后，清空报告数据\",\"triggerType\":\"客户工单管理.CUS_confuse_AFTER\",\"executionEvent\":\"客户工单管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6368fae1c63a1918031fa4c3\",\"status\":\"ENABLE\",\"eventName\":\"客户工单管理-风险品处理方案子表赋值\",\"triggerType\":\"客户工单管理.表单新建时\",\"executionEvent\":\"风险品处理方案-下拉列表隐藏.查询数据,客户工单管理.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6368e840c63a1918031fa463\",\"status\":\"ENABLE\",\"eventName\":\"将8D任务人员ID转化为人员信息\",\"triggerType\":\"客户工单管理.字段值改变\",\"executionEvent\":\"客户工单管理.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6368e79fc63a1918031fa45f\",\"status\":\"ENABLE\",\"eventName\":\"将VOC任务分发人员ID转化为人员信息\",\"triggerType\":\"客户工单管理.字段值改变\",\"executionEvent\":\"客户工单管理.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63685c9dc63a1918031fa325\",\"status\":\"ENABLE\",\"eventName\":\"生成合同标题\",\"triggerType\":\"销售合同发起.字段值改变\",\"executionEvent\":\"销售合同发起.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63685a8bc63a1918031fa31b\",\"status\":\"ENABLE\",\"eventName\":\"销售合同默认给产品组赋值\",\"triggerType\":\"销售合同发起.表单新建时\",\"executionEvent\":\"销售合同发起.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63685921c63a1918031fa313\",\"status\":\"ENABLE\",\"eventName\":\"更改合同状态\",\"triggerType\":\"销售合同发起.状态变更\",\"executionEvent\":\"销售合同发起.更新数据,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63679874c63a1918031fa24f\",\"status\":\"ENABLE\",\"eventName\":\"同步合同号到子表\",\"triggerType\":\"销售合同发起.表单保存或提交时\",\"executionEvent\":\"销售合同发起.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63678aaac63a1918031fa21b\",\"status\":\"ENABLE\",\"eventName\":\"获取建议售价\",\"triggerType\":\"信贷放行申请表.字段值改变时\",\"executionEvent\":\"历史预测价格.查询数据,信贷放行申请表.分支节点,分支设置,分支设置,信贷放行申请表.分支节点,分支设置,分支设置,信贷放行申请表.字段赋值节点,信贷放行申请表.字段赋值节点,标准价预测.查询数据,信贷放行申请表.分支节点,分支设置,分支设置,信贷放行申请表.字段赋值节点,信贷放行申请表.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6364eb0fc63a1918031fa1db\",\"status\":\"ENABLE\",\"eventName\":\"将拒绝信息返回但客户管理中\",\"triggerType\":\"交易客户审核.拒绝后\",\"executionEvent\":\"客户管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6364ead8c63a1918031fa1d9\",\"status\":\"ENABLE\",\"eventName\":\"将拒绝信息返回到客户管理中\",\"triggerType\":\"交易客户审核.拒绝后\",\"executionEvent\":\"客户管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6364a8ddc63a1918031fa1a3\",\"status\":\"ENABLE\",\"eventName\":\"D4客户报告推送文档库\",\"triggerType\":\"客户工单管理.同意后\",\"executionEvent\":\"文档库.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6364a83cc63a1918031fa19f\",\"status\":\"ENABLE\",\"eventName\":\"D3报告推送文档库\",\"triggerType\":\"客户工单管理.同意后\",\"executionEvent\":\"文档库.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6364a5bac63a1918031fa18f\",\"status\":\"ENABLE\",\"eventName\":\"获取部门人员填写的周报数据\",\"triggerType\":\"部门周报.字段值改变时\",\"executionEvent\":\"个人周报-本周回款子表.查询数据,部门周报.字段赋值节点,部门周报.分支节点,分支设置,分支设置,数据校验,刷新节点,个人周报-本周销售子表.查询数据,部门周报.字段赋值节点,个人周报-本周项目子表.查询数据,部门周报.字段赋值节点,个人周报-下周回款子表.查询数据,部门周报.字段赋值节点,个人周报-下周销量子表.查询数据,部门周报.字段赋值节点,个人周报-下周项目子表.查询数据,部门周报.字段赋值节点,个人周报-下周出差计划子表.查询数据,部门周报.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63639940c63a1918031fa009\",\"status\":\"ENABLE\",\"eventName\":\"D7附件推送文档库\",\"triggerType\":\"客户工单管理.同意后\",\"executionEvent\":\"文档库.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63639881c63a1918031fa005\",\"status\":\"ENABLE\",\"eventName\":\"D6文件推送文档库\",\"triggerType\":\"客户工单管理.同意后\",\"executionEvent\":\"文档库.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63639746c63a1918031fa001\",\"status\":\"ENABLE\",\"eventName\":\"D5文件推送至文档库\",\"triggerType\":\"客户工单管理.同意后\",\"executionEvent\":\"文档库.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63639456c63a1918031f9fff\",\"status\":\"ENABLE\",\"eventName\":\"进展赋值\",\"triggerType\":\"客户工单管理.\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"63637482c63a1918031f9fa3\",\"status\":\"DISABLE\",\"eventName\":\"部门月报月内提交次数校验\",\"triggerType\":\"部门月报.表单提交前\",\"executionEvent\":\"个人月报.查询数据,计算数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63637175c63a1918031f9f8b\",\"status\":\"ENABLE\",\"eventName\":\"个人月报月内提交次数校验\",\"triggerType\":\"个人月报.表单提交前\",\"executionEvent\":\"个人月报.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63636956c63a1918031f9f79\",\"status\":\"DISABLE\",\"eventName\":\"部门周报周内提交次数校验\",\"triggerType\":\"部门周报.表单提交前\",\"executionEvent\":\"部门周报.查询数据,计算数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63635048c63a1918031f9f5f\",\"status\":\"ENABLE\",\"eventName\":\"计算本月回款总额\",\"triggerType\":\"部门月报.字段值改变时\",\"executionEvent\":\"回款目标.查询数据,计算数据,部门月报.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636269d0c63a1918031f9f1f\",\"status\":\"ENABLE\",\"eventName\":\"计算本月回款总额\",\"triggerType\":\"部门周报.字段值改变时\",\"executionEvent\":\"回款目标.查询数据,计算数据,部门周报.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63626174c63a1918031f9f13\",\"status\":\"ENABLE\",\"eventName\":\"个人周报周内提交次数校验\",\"triggerType\":\"个人周报.表单提交前\",\"executionEvent\":\"数据校验,个人周报.查询数据,计算数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"636226de853c9d5b0b02c6d6\",\"status\":\"DISABLE\",\"eventName\":\"客户工单管理-投诉日期校验\",\"triggerType\":\"客户工单管理.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6361e1cb853c9d5b0b02c6ac\",\"status\":\"ENABLE\",\"eventName\":\"回款目标-暂存前校验\",\"triggerType\":\"回款目标.表单暂存前触发\",\"executionEvent\":\"回款目标.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6361e013853c9d5b0b02c69e\",\"status\":\"ENABLE\",\"eventName\":\"回款目标-提交前校验\",\"triggerType\":\"回款目标.表单提交前\",\"executionEvent\":\"回款目标.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6361d604853c9d5b0b02c694\",\"status\":\"ENABLE\",\"eventName\":\"VOC报告推送到文档库\",\"triggerType\":\"客户工单管理.同意后\",\"executionEvent\":\"文档库.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6361cc66853c9d5b0b02c67c\",\"status\":\"ENABLE\",\"eventName\":\"D5拒绝后清空\",\"triggerType\":\"客户工单管理.CUS_confuse_dfive_AFTER\",\"executionEvent\":\"客户工单管理.清空时间和附件\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6361cbef853c9d5b0b02c67a\",\"status\":\"ENABLE\",\"eventName\":\"D6拒绝后清空\",\"triggerType\":\"客户工单管理.CUS_confuse_dsix_AFTER\",\"executionEvent\":\"客户工单管理.清空时间和附件\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6361c9d7853c9d5b0b02c674\",\"status\":\"ENABLE\",\"eventName\":\"拒绝后清空\",\"triggerType\":\"客户工单管理.CUS_confuse_dseven_AFTER\",\"executionEvent\":\"客户工单管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6361009f853c9d5b0b02c606\",\"status\":\"ENABLE\",\"eventName\":\"内部满意度评价-提交前校验\",\"triggerType\":\"内部满意度评价.表单提交前\",\"executionEvent\":\"内部满意度评价.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6360ffc4853c9d5b0b02c604\",\"status\":\"ENABLE\",\"eventName\":\"客户年度满意度调查-提交前校验\",\"triggerType\":\"客户年度满意度调查问卷.表单提交前\",\"executionEvent\":\"客户年度满意度调查问卷.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6360ff1d853c9d5b0b02c602\",\"status\":\"ENABLE\",\"eventName\":\"内部满意度评价-暂存时校验\",\"triggerType\":\"内部满意度评价.表单暂存前触发\",\"executionEvent\":\"内部满意度评价.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6360fc88853c9d5b0b02c600\",\"status\":\"ENABLE\",\"eventName\":\"客户年度满意度调查-暂存时校验\",\"triggerType\":\"客户年度满意度调查问卷.表单暂存前触发\",\"executionEvent\":\"客户年度满意度调查问卷.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6360e8f6853c9d5b0b02c5e0\",\"status\":\"ENABLE\",\"eventName\":\"客户4M变更-客户批准报告推送至文档库\",\"triggerType\":\"客户工单管理.同意后\",\"executionEvent\":\"文档库.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6360e7c6853c9d5b0b02c5de\",\"status\":\"ENABLE\",\"eventName\":\"客户4M变更-可行性分析报告归档至文档库\",\"triggerType\":\"客户工单管理.同意后\",\"executionEvent\":\"文档库.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6360bf73853c9d5b0b02c576\",\"status\":\"ENABLE\",\"eventName\":\"获取询报价中产品信息\",\"triggerType\":\"销售合同发起.字段值改变\",\"executionEvent\":\"销售询报价.查询数据,销售合同发起.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6360aac0853c9d5b0b02c558\",\"status\":\"ENABLE\",\"eventName\":\"计算本月回款总额\",\"triggerType\":\"个人月报.字段值改变时\",\"executionEvent\":\"回款目标.查询数据,计算数据,个人月报.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63607662853c9d5b0b02c530\",\"status\":\"ENABLE\",\"eventName\":\"计算该客户当月回款总额\",\"triggerType\":\"个人周报.字段值改变时\",\"executionEvent\":\"回款目标.查询数据,计算数据,个人周报.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635fbdc1853c9d5b0b02c500\",\"status\":\"ENABLE\",\"eventName\":\"转需求拒绝时状态更改\",\"triggerType\":\"线索转需求审核.拒绝后\",\"executionEvent\":\"线索跟进.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635fbd66853c9d5b0b02c4fe\",\"status\":\"ENABLE\",\"eventName\":\"转需求状态提交\",\"triggerType\":\"线索转需求审核.表单提交时\",\"executionEvent\":\"线索跟进.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635f3fa6853c9d5b0b02c3a4\",\"status\":\"DISABLE\",\"eventName\":\"临时赋值CQE\",\"triggerType\":\"客户工单管理.临时赋值CQE负责人按钮\",\"executionEvent\":\"弹窗节点,整合数据,客户工单管理.更新数据,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635f23c6853c9d5b0b02c372\",\"status\":\"DISABLE\",\"eventName\":\"工厂CQE\",\"triggerType\":\"客户工单管理.字段值改变\",\"executionEvent\":\"客户工单管理.是否有效客诉-字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635ba7f3853c9d5b0b02c330\",\"status\":\"ENABLE\",\"eventName\":\"赋值有效期截止日期\",\"triggerType\":\"客户批量授信管理.字段值改变\",\"executionEvent\":\"客户批量授信管理.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635ba711853c9d5b0b02c32c\",\"status\":\"ENABLE\",\"eventName\":\"赋值本季度日期\",\"triggerType\":\"客户批量授信管理.表单新建时\",\"executionEvent\":\"客户批量授信管理.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635ba3c3853c9d5b0b02c322\",\"status\":\"DISABLE\",\"eventName\":\"定时每季度初将审批通过的授信额度数据更新到客户信息中\",\"triggerType\":\"定时触发\",\"executionEvent\":\"客户授信预览.查询数据,客户管理.更新数据,客户管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635b9db5853c9d5b0b02c308\",\"status\":\"ENABLE\",\"eventName\":\"提交前校验\",\"triggerType\":\"线索池.表单保存或提交前\",\"executionEvent\":\"线索池.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635b93b2853c9d5b0b02c28c\",\"status\":\"DISABLE\",\"eventName\":\"测试结果跟进-提交前校验预计测试时间、计划反馈时间\",\"triggerType\":\"测试结果跟进.表单提交前\",\"executionEvent\":\"数据校验,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635b92d7853c9d5b0b02c286\",\"status\":\"DISABLE\",\"eventName\":\"测试结果跟进-校验计划反馈时间\",\"triggerType\":\"测试结果跟进.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635b927a853c9d5b0b02c282\",\"status\":\"DISABLE\",\"eventName\":\"测试结果跟进-预计测试时间校验\",\"triggerType\":\"测试结果跟进.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635b9099853c9d5b0b02c27a\",\"status\":\"ENABLE\",\"eventName\":\"送样状态跟踪-提交前、校验确定送样日期\",\"triggerType\":\"送样状态跟踪.表单提交前\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635b903a853c9d5b0b02c274\",\"status\":\"DISABLE\",\"eventName\":\"送样状态跟踪-校验确定送样时间\",\"triggerType\":\"送样状态跟踪.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635b7c55853c9d5b0b02c20a\",\"status\":\"ENABLE\",\"eventName\":\"送样申请-取消选择客户时-清空送样地址、联系人\",\"triggerType\":\"送样申请.字段值改变\",\"executionEvent\":\"送样申请.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635b7ac2853c9d5b0b02c204\",\"status\":\"ENABLE\",\"eventName\":\"送样申请-提交前-校验期望送样时间\",\"triggerType\":\"送样申请.表单提交前\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635b79a6853c9d5b0b02c1fe\",\"status\":\"ENABLE\",\"eventName\":\"送样申请-期望送样日期变更校验\",\"triggerType\":\"送样申请.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635b702f853c9d5b0b02c1e8\",\"status\":\"ENABLE\",\"eventName\":\"拒绝后将线索跟进状态更改\",\"triggerType\":\"线索关闭审核.拒绝后\",\"executionEvent\":\"线索跟进.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635b6f29853c9d5b0b02c1e6\",\"status\":\"ENABLE\",\"eventName\":\"线索关闭时状态更改\",\"triggerType\":\"线索关闭审核.表单保存或提交时\",\"executionEvent\":\"线索跟进.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635b4c46853c9d5b0b02c1ac\",\"status\":\"ENABLE\",\"eventName\":\"简化类需求提报-提交前校验客户期望送样时间\",\"triggerType\":\"简化类需求提报.表单提交前\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635b49fe853c9d5b0b02c1aa\",\"status\":\"ENABLE\",\"eventName\":\"简化类需求提报-研发类需求-警告提醒\",\"triggerType\":\"简化类需求提报.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635b4835853c9d5b0b02c18e\",\"status\":\"ENABLE\",\"eventName\":\"样品送样类需求提报-客户期望时间不晚于今天\",\"triggerType\":\"简化类需求提报.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},";

        String s4 ="{\"eventId\":\"635a4476ddd10d4fefc44331\",\"status\":\"ENABLE\",\"eventName\":\"删除数据\",\"triggerType\":\"SAP付款条件.自定义按钮\",\"executionEvent\":\"SAP付款条件.删除数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635a2a04ddd10d4fefc44313\",\"status\":\"ENABLE\",\"eventName\":\"客户提交前校验税号是否重复\",\"triggerType\":\"交易客户审核.表单提交前\",\"executionEvent\":\"客户管理.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635a28faddd10d4fefc44311\",\"status\":\"ENABLE\",\"eventName\":\"客户变更时校验税号是否是唯一\",\"triggerType\":\"客户变更审核.表单保存或提交前\",\"executionEvent\":\"客户管理.查询数据,数据校验,客户变更审核.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6359d6e7ddd10d4fefc442c9\",\"status\":\"ENABLE\",\"eventName\":\"客户转交易客户暂存时将数据同步到潜客中\",\"triggerType\":\"交易客户审核.表单暂存后触发\",\"executionEvent\":\"客户管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6358d67dddd10d4fefc44281\",\"status\":\"ENABLE\",\"eventName\":\"绩效考核-提交前校验项目权重\",\"triggerType\":\"绩效考核.表单提交前\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6358a0baddd10d4fefc44247\",\"status\":\"ENABLE\",\"eventName\":\"开票申请提交后-发送邮件提醒财务开票\",\"triggerType\":\"\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"63589ed8ddd10d4fefc44241\",\"status\":\"ENABLE\",\"eventName\":\"开票申请-发票号填写后-更新合同一览表已开票金额\",\"triggerType\":\"开票明细-隐藏表单.字段值改变\",\"executionEvent\":\"合同一览表.更新合同已开票数量,开票明细-隐藏表单.查询数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63588532ddd10d4fefc4420d\",\"status\":\"ENABLE\",\"eventName\":\"开票申请-提交前校验开票数量\",\"triggerType\":\"开票申请.表单提交前\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635884b1ddd10d4fefc44209\",\"status\":\"DISABLE\",\"eventName\":\"开票数量-变更校验数量少于剩余开票数量\",\"triggerType\":\"开票申请.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6357a187ddd10d4fefc441d5\",\"status\":\"ENABLE\",\"eventName\":\"获取内部满意度评价平均分\",\"triggerType\":\"客户年度满意度调查问卷.计算客户最终满意度\",\"executionEvent\":\"内部满意度评价.查询数据,客户年度满意度调查问卷.更新数据,计算数据,整合数据,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63577f53ddd10d4fefc441b7\",\"status\":\"ENABLE\",\"eventName\":\"客户批准报告提交时间校验\",\"triggerType\":\"客户工单管理.客户批准报告上传.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63577ef8ddd10d4fefc441b5\",\"status\":\"ENABLE\",\"eventName\":\"客户4M变更-可行性分析报告提交时间校验\",\"triggerType\":\"客户工单管理.可行性分析报告上传.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63575145ddd10d4fefc441a9\",\"status\":\"ENABLE\",\"eventName\":\"客户报告提交时间、是否提交校验\",\"triggerType\":\"客户工单管理.CQE审批根本原因.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63574fbbddd10d4fefc441a7\",\"status\":\"ENABLE\",\"eventName\":\"流转D4前校验\",\"triggerType\":\"客户工单管理.D3填写.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63574ed8ddd10d4fefc441a3\",\"status\":\"DISABLE\",\"eventName\":\"投诉产品生产日期校验\",\"triggerType\":\"客户工单管理.D2填写.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63574dafddd10d4fefc4419f\",\"status\":\"ENABLE\",\"eventName\":\"客户4M变更-客户批准文件提交时间校验\",\"triggerType\":\"客户工单管理.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63574d13ddd10d4fefc4419b\",\"status\":\"ENABLE\",\"eventName\":\"客户4M变更-可行性分析报告提交时间校验\",\"triggerType\":\"客户工单管理.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63574c00ddd10d4fefc4418d\",\"status\":\"DISABLE\",\"eventName\":\"D7客户报告提交时间校验\",\"triggerType\":\"客户工单管理.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63574bc6ddd10d4fefc44189\",\"status\":\"DISABLE\",\"eventName\":\"D6客户报告提交时间校验\",\"triggerType\":\"客户工单管理.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63574b90ddd10d4fefc44185\",\"status\":\"DISABLE\",\"eventName\":\"D5客户报告提交时间校验\",\"triggerType\":\"客户工单管理.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63574b19ddd10d4fefc44181\",\"status\":\"DISABLE\",\"eventName\":\"D5措施信息-计划完成时间校验\",\"triggerType\":\"客户工单管理.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6357427eddd10d4fefc4417d\",\"status\":\"DISABLE\",\"eventName\":\"8D流程-D4报告提交时间校验\",\"triggerType\":\"客户工单管理.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6357420bddd10d4fefc44179\",\"status\":\"DISABLE\",\"eventName\":\"8D流程-D4根本原因分析-纳期校验\",\"triggerType\":\"客户工单管理.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635741cfddd10d4fefc44175\",\"status\":\"DISABLE\",\"eventName\":\"8D流程-项目措施-计划完成时间校验\",\"triggerType\":\"客户工单管理.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6357418dddd10d4fefc44171\",\"status\":\"DISABLE\",\"eventName\":\"8D流程-D3报告提交时间校验\",\"triggerType\":\"客户工单管理.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63574122ddd10d4fefc4416d\",\"status\":\"DISABLE\",\"eventName\":\"8D流程-D2投诉产品生产日期校验\",\"triggerType\":\"客户工单管理.字段值改变时\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63553fdbddd10d4fefc4412b\",\"status\":\"ENABLE\",\"eventName\":\"提交后状态变更\",\"triggerType\":\"\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"63553c1addd10d4fefc44127\",\"status\":\"ENABLE\",\"eventName\":\"获取建议售价\",\"triggerType\":\"销售合同变更.字段值改变时\",\"executionEvent\":\"历史预测价格.查询数据,销售合同变更.分支节点,分支设置,分支设置,销售合同变更.分支节点,分支设置,分支设置,销售合同变更.字段赋值节点,销售合同变更.字段赋值节点,标准价预测.查询数据,销售合同变更.分支节点,分支设置,分支设置,销售合同变更.字段赋值节点,销售合同变更.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63550c87ddd10d4fefc44065\",\"status\":\"ENABLE\",\"eventName\":\"项目管理-数据提交时更新数据\",\"triggerType\":\"\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"63550893ddd10d4fefc4404f\",\"status\":\"DISABLE\",\"eventName\":\"送样状态跟踪-新增数据后-推送项目信息\",\"triggerType\":\"送样状态跟踪.表单保存成功后触发\",\"executionEvent\":\"销售项目管理.更新项目管理,需求一览表.查询需求，赋值应用场景,销售项目管理.更新项目中需求信息,客户管理.查询客户信息,销售项目管理.更新客户信息\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6354fc3eddd10d4fefc44001\",\"status\":\"ENABLE\",\"eventName\":\"紧急发货-建议售价\",\"triggerType\":\"紧急发货申请.字段值改变时\",\"executionEvent\":\"价格预测.查询数据,紧急发货申请.分支节点,分支设置,分支设置,紧急发货申请.分支节点,分支设置,分支设置,紧急发货申请.字段赋值节点,紧急发货申请.字段赋值节点,标准价预测.查询数据,紧急发货申请.分支节点,分支设置,分支设置,紧急发货申请.字段赋值节点,紧急发货申请.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6354fb4bddd10d4fefc43ffb\",\"status\":\"ENABLE\",\"eventName\":\"需求分析变更归档到文档库\",\"triggerType\":\"需求变更.\",\"executionEvent\":\"文档库.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6354f976ddd10d4fefc43fe7\",\"status\":\"ENABLE\",\"eventName\":\"拜访记录报告归档到文档库\",\"triggerType\":\"拜访行为管理.表单保存或提交成功后触发\",\"executionEvent\":\"文档库.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6354f5e3ddd10d4fefc43fc3\",\"status\":\"ENABLE\",\"eventName\":\"行业峰会报告归档到文档库\",\"triggerType\":\"行业峰会.\",\"executionEvent\":\"文档库.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6354f5d4ddd10d4fefc43fc1\",\"status\":\"ENABLE\",\"eventName\":\"个人月报出差开始时间校验\",\"triggerType\":\"个人月报.表单提交前\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6354f50dddd10d4fefc43fbd\",\"status\":\"ENABLE\",\"eventName\":\"开始时间校验\",\"triggerType\":\"个人周报.表单提交前\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6354f1d7ddd10d4fefc43f8d\",\"status\":\"ENABLE\",\"eventName\":\"市场报告同步到文档库中\",\"triggerType\":\"市场报告.\",\"executionEvent\":\"文档库.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6354ad51ddd10d4fefc43e11\",\"status\":\"ENABLE\",\"eventName\":\"开票申请-获取当前客户合同物料-已开票数量\",\"triggerType\":\"开票申请.字段值改变时\",\"executionEvent\":\"开票明细-隐藏表单.查询数据,开票申请.字段赋值节点,计算数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6354aafeddd10d4fefc43def\",\"status\":\"DISABLE\",\"eventName\":\"框架协议提交后状态更改\",\"triggerType\":\"框架协议发起.表单保存或提交时\",\"executionEvent\":\"框架协议发起.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6353c5f0ddd10d4fefc43d9d\",\"status\":\"DISABLE\",\"eventName\":\"开票申请-获取SAP、CRM合同号、订单号\",\"triggerType\":\"开票申请.字段值改变\",\"executionEvent\":\"订单一览表.查询数据,开票申请.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6353a6d7ddd10d4fefc43d5b\",\"status\":\"ENABLE\",\"eventName\":\"D7预防措施审批-提交前-校验客户报告提交时间\",\"triggerType\":\"客户工单管理.D7预防措施审批.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6353a630ddd10d4fefc43d59\",\"status\":\"ENABLE\",\"eventName\":\"D6执行确认-提交前-校验客户报告提交时间\",\"triggerType\":\"客户工单管理.D6执行确认.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6353a560ddd10d4fefc43d57\",\"status\":\"ENABLE\",\"eventName\":\"D5措施审批-校验客户报告提交时间\",\"triggerType\":\"客户工单管理.D5措施审批.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6353a377ddd10d4fefc43d55\",\"status\":\"DISABLE\",\"eventName\":\"D5提交措施-校验计划完成时间-晚于今天\",\"triggerType\":\"客户工单管理.D5措施信息填写.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63524b4d7a5de1243b4b3813\",\"status\":\"DISABLE\",\"eventName\":\"D5措施处理-进展校验\",\"triggerType\":\"客户工单管理.D5措施处理-责任人提交处理结果.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635244a87a5de1243b4b37df\",\"status\":\"ENABLE\",\"eventName\":\"销售询报价-建议售价查询\",\"triggerType\":\"销售询报价.字段值改变时\",\"executionEvent\":\"历史预测价格.查询数据,销售询报价.分支节点,分支设置,分支设置,销售询报价.分支节点,分支设置,分支设置,销售询报价.字段赋值节点,销售询报价.字段赋值节点,标准价预测.查询数据,销售询报价.分支节点,分支设置,分支设置,销售询报价.字段赋值节点,销售询报价.字段赋值节点,整合数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63523e817a5de1243b4b37cf\",\"status\":\"DISABLE\",\"eventName\":\"业务事件名称:D5措施信息提交-进展校验\",\"triggerType\":\"客户工单管理.D5措施信息填写.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6352344d7a5de1243b4b37a5\",\"status\":\"ENABLE\",\"eventName\":\"销售询报价-建议售价获取\",\"triggerType\":\"\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"635233e37a5de1243b4b379f\",\"status\":\"ENABLE\",\"eventName\":\"框架协议发起-物料库存信息获取\",\"triggerType\":\"框架协议发起.\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"63520a447a5de1243b4b36e3\",\"status\":\"ENABLE\",\"eventName\":\"清空生成工厂\",\"triggerType\":\"销售合同发起.字段值改变\",\"executionEvent\":\"销售合同发起.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635147897a5de1243b4b3619\",\"status\":\"ENABLE\",\"eventName\":\"客户工单管理-提交前-有效性赋值-空值\",\"triggerType\":\"\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"635142c17a5de1243b4b35f9\",\"status\":\"ENABLE\",\"eventName\":\"客户工单管理-提交前-有效性赋值\",\"triggerType\":\"客户工单管理.表单提交前\",\"executionEvent\":\"客户工单管理.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635142307a5de1243b4b35f7\",\"status\":\"ENABLE\",\"eventName\":\"客户工单管理-新建时有效性判断\",\"triggerType\":\"\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"63513b757a5de1243b4b35d9\",\"status\":\"ENABLE\",\"eventName\":\"新建时判断\",\"triggerType\":\"\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"635134f67a5de1243b4b35bb\",\"status\":\"DISABLE\",\"eventName\":\"客户工单管理-提交前-校验\",\"triggerType\":\"客户工单管理.表单提交前\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635134e57a5de1243b4b35b9\",\"status\":\"DISABLE\",\"eventName\":\"销售合同发起-产品-建议售价获取\",\"triggerType\":\"销售合同发起.字段值改变时\",\"executionEvent\":\"历史预测价格.查询数据,销售合同发起.分支节点,分支设置,分支设置,标准价预测.查询数据,销售合同发起.分支节点,分支设置,分支设置,销售合同发起.字段赋值节点,销售合同发起.字段赋值节点,销售合同发起.分支节点,分支设置,分支设置,销售合同发起.字段赋值节点,销售合同发起.字段赋值节点,整合数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635133a37a5de1243b4b35b1\",\"status\":\"ENABLE\",\"eventName\":\"客户工单管理-无效\",\"triggerType\":\"客户工单管理.拒绝后\",\"executionEvent\":\"客户工单管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635131d27a5de1243b4b35ad\",\"status\":\"ENABLE\",\"eventName\":\"客户工单管理-客诉有效\",\"triggerType\":\"客户工单管理.同意后\",\"executionEvent\":\"客户工单管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63512edf7a5de1243b4b35a3\",\"status\":\"ENABLE\",\"eventName\":\"销售合同变更-带出合同明细\",\"triggerType\":\"销售合同变更.字段值改变\",\"executionEvent\":\"销售合同发起.查询数据,销售合同变更.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63512c567a5de1243b4b358f\",\"status\":\"ENABLE\",\"eventName\":\"获取部门人员月报\",\"triggerType\":\"部门月报.字段值改变时\",\"executionEvent\":\"个人月报—本月回款子表.查询数据,部门月报.字段赋值节点,部门月报.分支节点,分支设置,分支设置,刷新节点,数据校验,个人月报-本月销售子表.查询数据,部门月报.字段赋值节点,个人月报-本月项目子表.查询数据,部门月报.字段赋值节点,个人月报-本月项目子表.查询数据,部门月报.字段赋值节点,个人月报-下月回款子表.查询数据,部门月报.字段赋值节点,个人月报-下月销量子表.查询数据,部门月报.字段赋值节点,个人月报-下月项目子表.查询数据,部门月报.字段赋值节点,个人月报-出差计划.查询数据,部门月报.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"635122397a5de1243b4b3561\",\"status\":\"DISABLE\",\"eventName\":\"价格预测提交时状态更改\",\"triggerType\":\"价格预测.表单保存或提交前\",\"executionEvent\":\"价格预测.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63510a497a5de1243b4b3505\",\"status\":\"DISABLE\",\"eventName\":\"VOC任务结果提交前校验进展\",\"triggerType\":\"客户工单管理.VOC任务负责人处理并提交任务结果.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6350eaa87a5de1243b4b346d\",\"status\":\"ENABLE\",\"eventName\":\"赋值审批路径\",\"triggerType\":\"退换货申请.字段值改变时\",\"executionEvent\":\"退换货申请.分支节点,分支设置,分支设置,退换货申请.字段赋值节点,退换货申请.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6350e26e7a5de1243b4b33fd\",\"status\":\"DISABLE\",\"eventName\":\"内部满意度评价-提交后-更新总分至客户年度满意度调查问卷\",\"triggerType\":\"内部满意度评价.表单提交时\",\"executionEvent\":\"内部满意度评价.查询数据,客户年度满意度调查问卷.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6350dd867a5de1243b4b33cd\",\"status\":\"ENABLE\",\"eventName\":\"内部满意度评价-总分更改-评价等级赋值\",\"triggerType\":\"内部满意度评价.字段值改变时\",\"executionEvent\":\"内部满意度评价.分支节点,分支设置,分支设置,分支设置,分支设置,内部满意度评价.字段赋值节点,内部满意度评价.字段赋值节点,内部满意度评价.字段赋值节点,内部满意度评价.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6350c4fa7a5de1243b4b33a1\",\"status\":\"DISABLE\",\"eventName\":\"客户满意度调查问卷-新建提交后-打分为空\",\"triggerType\":\"客户年度满意度调查问卷.表单暂存后触发\",\"executionEvent\":\"客户年度满意度调查问卷.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6350b7dd7a5de1243b4b3335\",\"status\":\"ENABLE\",\"eventName\":\"获取部门人员周报信息\",\"triggerType\":\"部门周报.字段值改变\",\"executionEvent\":\"个人周报-本周回款子表.查询数据,部门周报.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634fe86a7a5de1243b4b323b\",\"status\":\"ENABLE\",\"eventName\":\"获取已维护完成的公式信息\",\"triggerType\":\"价格公式维护.字段值改变时\",\"executionEvent\":\"价格公式维护.分支节点,分支设置,分支设置,价格公式预览.查询数据,价格公式维护.字段赋值节点,价格公式预览.查询数据,价格公式维护.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634fdeac7a5de1243b4b3215\",\"status\":\"ENABLE\",\"eventName\":\"当是标准价维护时赋值\",\"triggerType\":\"价格公式维护.字段值改变时\",\"executionEvent\":\"价格公式维护.分支节点,分支设置,分支设置,价格公式维护.字段赋值节点,价格公式维护.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634f4a8e7a5de1243b4b2e9b\",\"status\":\"ENABLE\",\"eventName\":\"清空关联客户编码\",\"triggerType\":\"客户管理.字段值改变\",\"executionEvent\":\"客户管理.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634f43437a5de1243b4b2e6f\",\"status\":\"ENABLE\",\"eventName\":\"分配潜在客户\",\"triggerType\":\"客户分配.表单保存或提交时\",\"executionEvent\":\"客户管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634ea1a87a5de1243b4b2e5d\",\"status\":\"ENABLE\",\"eventName\":\"已过冷静期的客户回到客户公海中\",\"triggerType\":\"定时触发\",\"executionEvent\":\"客户管理.更新数据,客户管理.查询数据,外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e9b297a5de1243b4b2e45\",\"status\":\"ENABLE\",\"eventName\":\"客户等级信息返回到客户信息中\",\"triggerType\":\"客户等级评价表.进入节点前\",\"executionEvent\":\"客户管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e90c27a5de1243b4b2df5\",\"status\":\"ENABLE\",\"eventName\":\"批量申请额度提交后更改状态\",\"triggerType\":\"客户批量授信管理.表单保存或提交时\",\"executionEvent\":\"客户批量授信管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e906d7a5de1243b4b2df3\",\"status\":\"ENABLE\",\"eventName\":\"简化类需求提报-研发需求不允许提交\",\"triggerType\":\"简化类需求提报.表单提交前\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e8d697a5de1243b4b2dcb\",\"status\":\"ENABLE\",\"eventName\":\"样品已签收\",\"triggerType\":\"送样状态跟踪.已签收\",\"executionEvent\":\"弹窗节点,送样状态跟踪.更新数据,刷新节点,测试结果跟进.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e8c1b7a5de1243b4b2dbb\",\"status\":\"ENABLE\",\"eventName\":\"内销/外销赋值\",\"triggerType\":\"信贷放行申请表.字段值改变时\",\"executionEvent\":\"信贷放行申请表.分支节点,分支设置,分支设置,信贷放行申请表.字段赋值节点,信贷放行申请表.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e88737a5de1243b4b2da3\",\"status\":\"ENABLE\",\"eventName\":\"样品已寄送\",\"triggerType\":\"送样状态跟踪.已寄送\",\"executionEvent\":\"弹窗节点,整合数据,送样状态跟踪.更新数据,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e7aca7a5de1243b4b2d33\",\"status\":\"ENABLE\",\"eventName\":\"提交授信申请数据\",\"triggerType\":\"客户批量授信管理.表单暂存后触发\",\"executionEvent\":\"客户授信预览.提交数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e78d67a5de1243b4b2d2d\",\"status\":\"ENABLE\",\"eventName\":\"获取客户信息\",\"triggerType\":\"客户批量授信管理.字段值改变时\",\"executionEvent\":\"客户管理.查询数据,客户批量授信管理.字段赋值节点,SAP付款条件.查询数据,整合数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e77697a5de1243b4b2d27\",\"status\":\"ENABLE\",\"eventName\":\"批量授信提交校验\",\"triggerType\":\"客户批量授信管理.表单保存或提交前\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e6a937a5de1243b4b2ce9\",\"status\":\"ENABLE\",\"eventName\":\"赋值到相应部门\",\"triggerType\":\"客户管理.字段值改变时\",\"executionEvent\":\"客户管理.分支节点,分支设置,分支设置,分支设置,分支设置,分支设置,客户管理.字段赋值节点,客户管理.字段赋值节点,客户管理.字段赋值节点,客户管理.字段赋值节点,客户管理.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e66d47a5de1243b4b2cd3\",\"status\":\"ENABLE\",\"eventName\":\"失效客户转为潜在客户\",\"triggerType\":\"客户管理.失效客户转潜在客户\",\"executionEvent\":\"弹窗节点,客户管理.更新数据,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e65cc7a5de1243b4b2cc3\",\"status\":\"ENABLE\",\"eventName\":\"失效客户转交易客户\",\"triggerType\":\"客户管理.失效客户转交易客户\",\"executionEvent\":\"弹窗节点,客户管理.更新数据,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e5f427a5de1243b4b2c9d\",\"status\":\"ENABLE\",\"eventName\":\"客户失效申请中\",\"triggerType\":\"客户失效审核.表单保存或提交时\",\"executionEvent\":\"客户管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e5e917a5de1243b4b2c97\",\"status\":\"ENABLE\",\"eventName\":\"客户失效成功\",\"triggerType\":\"客户失效审核.进入节点后\",\"executionEvent\":\"客户管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e5a2f7a5de1243b4b2c6f\",\"status\":\"ENABLE\",\"eventName\":\"客户信息变更数据返回\",\"triggerType\":\"客户变更审核.销管.\",\"executionEvent\":\"客户管理.更新数据,外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e575b7a5de1243b4b2c5f\",\"status\":\"ENABLE\",\"eventName\":\"将转交易客户补充的数据返回到客户管理中\",\"triggerType\":\"交易客户审核.表单保存或提交时\",\"executionEvent\":\"客户管理.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e55907a5de1243b4b2c43\",\"status\":\"ENABLE\",\"eventName\":\"转交易客户成功\",\"triggerType\":\"交易客户审核.销售管理.\",\"executionEvent\":\"客户管理.更新数据,客户组织结构.更新数据,交易客户审核.分支节点,分支设置,分支设置,外部节点,外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e529e7a5de1243b4b2c3b\",\"status\":\"ENABLE\",\"eventName\":\"简化类需求通过-新增数据至需求池\",\"triggerType\":\"简化类需求提报.进入节点后\",\"executionEvent\":\"需求池.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e4ec77a5de1243b4b2c01\",\"status\":\"ENABLE\",\"eventName\":\"分发潜在客户\",\"triggerType\":\"客户管理.自定义按钮\",\"executionEvent\":\"客户分配.调用节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e4e207a5de1243b4b2be3\",\"status\":\"ENABLE\",\"eventName\":\"关闭交易客户申请\",\"triggerType\":\"客户管理.转为失效客户\",\"executionEvent\":\"客户失效审核.调用节点,客户变更审核.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e4c687a5de1243b4b2bd5\",\"status\":\"ENABLE\",\"eventName\":\"转为交易客户申请\",\"triggerType\":\"客户管理.转为交易客户\",\"executionEvent\":\"交易客户审核.调用节点,交易客户审核.查询数据,计算数据,数据校验,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e4a377a5de1243b4b2bb5\",\"status\":\"ENABLE\",\"eventName\":\"变更客户信息\",\"triggerType\":\"客户管理.信息变更\",\"executionEvent\":\"客户变更审核.调用节点,客户变更审核.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e49427a5de1243b4b2b99\",\"status\":\"ENABLE\",\"eventName\":\"需求审批意见-纳入评审、持续关注-不可拒绝\",\"triggerType\":\"需求提报.需求评审-RAT团队人员.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e48f97a5de1243b4b2b97\",\"status\":\"DISABLE\",\"eventName\":\"客户分级\",\"triggerType\":\"信用账期评价申请表.字段值改变时\",\"executionEvent\":\"信用账期评价申请表.分支节点,分支设置,分支设置,分支设置,分支设置,信用账期评价申请表.字段赋值节点,信用账期评价申请表.字段赋值节点,信用账期评价申请表.字段赋值节点,信用账期评价申请表.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e48c37a5de1243b4b2b91\",\"status\":\"ENABLE\",\"eventName\":\"需求审批意见-驳回修改-不允许同意\",\"triggerType\":\"需求提报.需求评审-RAT团队人员.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e47f77a5de1243b4b2b8b\",\"status\":\"DISABLE\",\"eventName\":\"客户评价\",\"triggerType\":\"信用账期评价申请表.字段值改变时\",\"executionEvent\":\"信用账期评价申请表.分支节点,分支设置,分支设置,分支设置,分支设置,分支设置\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e46c27a5de1243b4b2b7f\",\"status\":\"DISABLE\",\"eventName\":\"研发类需求通过-推送数据至需求池\",\"triggerType\":\"研发类需求提报.同意后\",\"executionEvent\":\"需求池.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e43fc7a5de1243b4b2b67\",\"status\":\"ENABLE\",\"eventName\":\"新建账期评价时赋值评价规则\",\"triggerType\":\"信用账期评价申请表.表单新建或编辑时\",\"executionEvent\":\"信用账期评价标准维护.查询数据,信用账期评价申请表.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e43607a5de1243b4b2b5f\",\"status\":\"ENABLE\",\"eventName\":\"权重不能超过或少于100\",\"triggerType\":\"信用账期评价标准维护.表单保存或提交前\",\"executionEvent\":\"计算数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e43037a5de1243b4b2b5b\",\"status\":\"ENABLE\",\"eventName\":\"权重不能超过100\",\"triggerType\":\"信用账期评价标准维护.字段值改变时\",\"executionEvent\":\"计算数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e416a7a5de1243b4b2b31\",\"status\":\"ENABLE\",\"eventName\":\"删除\",\"triggerType\":\"物料信息.表单按钮触发\",\"executionEvent\":\"物料信息.删除数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e3f237a5de1243b4b2b29\",\"status\":\"ENABLE\",\"eventName\":\"新建分级评价时赋值评价规则\",\"triggerType\":\"客户等级评价表.表单新建或编辑时\",\"executionEvent\":\"客户分级标准维护.查询数据,客户等级评价表.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e3cc47a5de1243b4b2b25\",\"status\":\"ENABLE\",\"eventName\":\"权重需达到100\",\"triggerType\":\"客户分级标准维护.表单保存或提交前\",\"executionEvent\":\"计算数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e3ae27a5de1243b4b2b0f\",\"status\":\"ENABLE\",\"eventName\":\"校验权重不能超过100\",\"triggerType\":\"客户分级标准维护.字段值改变时\",\"executionEvent\":\"数据校验,计算数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634e1fd57a5de1243b4b2ac3\",\"status\":\"ENABLE\",\"eventName\":\"客户等级计算\",\"triggerType\":\"客户等级评价表.字段值改变时\",\"executionEvent\":\"客户等级评价表.分支节点,分支设置,分支设置,分支设置,分支设置,客户等级评价表.字段赋值节点,客户等级评价表.字段赋值节点,客户等级评价表.字段赋值节点,客户等级评价表.字段赋值节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634d4fb37a5de1243b4b296b\",\"status\":\"DISABLE\",\"eventName\":\"获取线索对应客户信息\",\"triggerType\":\"拜访行为管理.字段值改变\",\"executionEvent\":\"线索跟进.查询数据,拜访行为管理.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634cc8957a5de1243b4b2693\",\"status\":\"ENABLE\",\"eventName\":\"产品库-产品状态改变-提示语\",\"triggerType\":\"产品库.字段值改变时\",\"executionEvent\":\"数据校验,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634cc6627a5de1243b4b268f\",\"status\":\"ENABLE\",\"eventName\":\"产品库信息保存-提醒\",\"triggerType\":\"产品库.表单保存前\",\"executionEvent\":\"弹窗节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"634cc42f7a5de1243b4b267b\",\"status\":\"ENABLE\",\"eventName\":\"产品库信息新建-提醒\",\"triggerType\":\"产品库.表单提交前\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63369f9b7a5de1243b4b2471\",\"status\":\"ENABLE\",\"eventName\":\"创建新需求\",\"triggerType\":\"线索转需求审核.销售管理.\",\"executionEvent\":\"线索转需求审核.分支节点,分支设置,分支设置,简化类需求提报.新增数据,需求提报.新增数据,线索跟进.更新数据,线索池.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"633533ab7a5de1243b4b2439\",\"status\":\"ENABLE\",\"eventName\":\"创建计划\",\"triggerType\":\"线索跟进.表单按钮触发\",\"executionEvent\":\"跟进计划.调用节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"633530b97a5de1243b4b2431\",\"status\":\"ENABLE\",\"eventName\":\"线索跟进-新建计划\",\"triggerType\":\"线索跟进.自定义按钮\",\"executionEvent\":\"跟进计划.调用节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63340f487a5de1243b4b2401\",\"status\":\"ENABLE\",\"eventName\":\"线索转化需求\",\"triggerType\":\"线索跟进.转化需求\",\"executionEvent\":\"线索转需求审核.调用节点,刷新节点,跟进计划.查询数据,线索跟进.分支节点,分支设置,分支设置,弹窗节点,计算数据,跟进计划.更新数据,跟进计划.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"633402797a5de1243b4b23c7\",\"status\":\"ENABLE\",\"eventName\":\"线索关闭审核-更新线索状态\",\"triggerType\":\"线索关闭审核.同意后\",\"executionEvent\":\"线索跟进.关闭线索跟进,线索池.关闭线索,跟进计划.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6333fba07a5de1243b4b23a5\",\"status\":\"ENABLE\",\"eventName\":\"线索跟进-关闭线索\",\"triggerType\":\"线索跟进.关闭线索\",\"executionEvent\":\"线索关闭审核.调用节点,刷新节点,跟进计划.查询数据,计算数据,线索跟进.分支节点,分支设置,分支设置,弹窗节点,跟进计划.更新数据,跟进计划.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6332ba147a5de1243b4b2381\",\"status\":\"ENABLE\",\"eventName\":\"计划执行-查看\",\"triggerType\":\"计划执行.自定义按钮\",\"executionEvent\":\"计划执行.调用节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6332b7017a5de1243b4b237d\",\"status\":\"ENABLE\",\"eventName\":\"更新计划状态\",\"triggerType\":\"计划执行更新.\",\"executionEvent\":\"计划执行更新.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6332b3ed7a5de1243b4b236f\",\"status\":\"ENABLE\",\"eventName\":\"计划执行-完成任务\",\"triggerType\":\"跟进计划.完成任务\",\"executionEvent\":\"计划执行更新.调用节点,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6332a20e7a5de1243b4b2335\",\"status\":\"ENABLE\",\"eventName\":\"计划执行-取消任务\",\"triggerType\":\"跟进计划.取消任务\",\"executionEvent\":\"弹窗节点,跟进计划.更新数据,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63329f5e7a5de1243b4b2333\",\"status\":\"DISABLE\",\"eventName\":\"计划执行-完成任务\",\"triggerType\":\"跟进计划.完成任务-作废\",\"executionEvent\":\"跟进计划.分支节点,分支设置,分支设置,弹窗节点,弹窗节点,跟进计划.更新数据,整合数据,整合数据,跟进计划.更新数据,刷新节点,弹窗节点,计划执行更新.调用节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63329ea97a5de1243b4b2331\",\"status\":\"ENABLE\",\"eventName\":\"计划执行-开启任务\",\"triggerType\":\"跟进计划.开启任务\",\"executionEvent\":\"弹窗节点,整合数据,跟进计划.更新数据,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63329d907a5de1243b4b2329\",\"status\":\"ENABLE\",\"eventName\":\"线索跟踪-新建跟踪任务\",\"triggerType\":\"线索跟进.自定义按钮\",\"executionEvent\":\"线索跟进.调用节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63328fb07a5de1243b4b2321\",\"status\":\"ENABLE\",\"eventName\":\"取消任务状态更新\",\"triggerType\":\"计划执行.\",\"executionEvent\":\"计划执行.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63328f7c7a5de1243b4b231f\",\"status\":\"ENABLE\",\"eventName\":\"完成任务状态更新\",\"triggerType\":\"计划执行.同意后\",\"executionEvent\":\"计划执行.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63328f127a5de1243b4b231d\",\"status\":\"ENABLE\",\"eventName\":\"完成任务校验\",\"triggerType\":\"跟进计划.任务负责人.\",\"executionEvent\":\"数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"633259a47a5de1243b4b22c5\",\"status\":\"DISABLE\",\"eventName\":\"线索跟进-提交子表\",\"triggerType\":\"线索跟进.\",\"executionEvent\":\"计划执行.提交数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63324fbe7a5de1243b4b22bb\",\"status\":\"ENABLE\",\"eventName\":\"获取销售人员\",\"triggerType\":\"线索池.字段值改变\",\"executionEvent\":\"客户管理.查询数据,线索池.字段赋值\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63318e3a7a5de1243b4b2299\",\"status\":\"DISABLE\",\"eventName\":\"线索跟踪-提交子表\",\"triggerType\":\"跟进计划.表单保存或提交成功后触发\",\"executionEvent\":\"跟进计划.提交节点,弹窗节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"633181057a5de1243b4b226b\",\"status\":\"ENABLE\",\"eventName\":\"智能分配线索\",\"triggerType\":\"线索池.表单提交时\",\"executionEvent\":\"线索跟进.新增数据,线索池.更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"63317bad7a5de1243b4b2265\",\"status\":\"ENABLE\",\"eventName\":\"销售跟进-更新线索池\",\"triggerType\":\"线索分发.同意后\",\"executionEvent\":\"线索池.更新数据,线索跟进.新增数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"633142517a5de1243b4b2229\",\"status\":\"ENABLE\",\"eventName\":\"分发线索\",\"triggerType\":\"线索池.线索分配\",\"executionEvent\":\"线索分发.调用节点,线索分发.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"632d87ca7a5de1243b4b21f3\",\"status\":\"ENABLE\",\"eventName\":\"线索分配部门\",\"triggerType\":\"线索池.自定义按钮\",\"executionEvent\":\"线索跟踪.调用节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"632d634f7a5de1243b4b21cd\",\"status\":\"ENABLE\",\"eventName\":\"线索池-线索分发\",\"triggerType\":\"线索池.\",\"executionEvent\":\"弹窗节点,整合数据,线索跟进.新增数据,线索池.更新数据,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"632aad1c7a5de1243b4b2095\",\"status\":\"ENABLE\",\"eventName\":\"公海客户转交易客户\",\"triggerType\":\"公海客户.公海客户转交易客户\",\"executionEvent\":\"交易客户审核.调用节点,客户管理.查询数据,数据校验\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"632aa32c7a5de1243b4b2079\",\"status\":\"ENABLE\",\"eventName\":\"更新SAP物料基础数据/每天\",\"triggerType\":\"定时触发\",\"executionEvent\":\"外部节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"632a6bdf7a5de1243b4b2045\",\"status\":\"ENABLE\",\"eventName\":\"重置查询条件\",\"triggerType\":\"物料库存查询-隐藏.重置\",\"executionEvent\":\"刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6329db5f7a5de1243b4b2029\",\"status\":\"ENABLE\",\"eventName\":\"查询物料库存信息\",\"triggerType\":\"物料库存查询-隐藏.查询\",\"executionEvent\":\"外部节点,物料库存查询-隐藏.分支节点,分支设置,分支设置,物料库存查询-隐藏.字段赋值节点,弹窗节点,刷新节点\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6322e55512dfe6516eb38b0c\",\"status\":\"ENABLE\",\"eventName\":\"更新物料基础数据\",\"triggerType\":\"外部节点触发\",\"executionEvent\":\"更新数据\",\"version\":\"v2.0\",\"intactFlag\":true},{\"eventId\":\"6322e54212dfe6516eb38b0a\",\"status\":\"ENABLE\",\"eventName\":\"更新物料基础数据\",\"triggerType\":\"\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"63197cad12dfe6516eb388b4\",\"status\":\"ENABLE\",\"eventName\":\"3\",\"triggerType\":\"\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"63197c7a12dfe6516eb388b2\",\"status\":\"ENABLE\",\"eventName\":\"1\",\"triggerType\":\"\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false},{\"eventId\":\"6319504e12dfe6516eb38890\",\"status\":\"ENABLE\",\"eventName\":\"创建根节点\",\"triggerType\":\"\",\"executionEvent\":\"\",\"version\":\"v2.0\",\"intactFlag\":false}]}";
        String s5 = s3 + s4;
        JSONArray data1 = JSONObject.parseObject(s5).getJSONArray("table");
        List<String> list = new ArrayList<>();

        for (Object datum : data1) {
            list.add(JSONObject.parseObject(JSONObject.toJSONString(datum)).getString("eventName"));
        }
        for (Object datum : data) {
            list.remove(JSONObject.parseObject(JSONObject.toJSONString(datum)).getString("eventName"));
        }
        System.out.println(JSONObject.toJSONString(list));
    }

}
