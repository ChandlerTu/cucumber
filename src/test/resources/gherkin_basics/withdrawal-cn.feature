# language: zh-CN
功能: 取现

  场景: 从信用卡账户成功取现
    假设我的账户上有100元
    当我取现20元
    那么20元应该被分发

  场景: 试图使用偷来的卡取现
    假设我的账户上有100元
    但是我的卡是无效的
    当我取现50元
    那么我的卡没有退回
    并且让我联系银行
