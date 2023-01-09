# 說明

Spring Boot @ConditionalOnProperty 用法簡單範例

## 情境
有相同的API路徑，但不同環境可以有不同實作，可使用Spring的@ConditionalOnProperty處理此問題

### 介紹 @ConditionalOnProperty 用法
此註解可以控制某個配置是否生效, 透過屬性`name`與`havingValue`來實現, 
`name`用來與application.properties中讀取某個屬性值, 如果該值為空返回false, 
如果值不為空則與`havingValue`設定的參數做比較，一樣則返回true，反之返回false. 
如果返回值為true, 則配置(configuration)生效; 為false不生效. 

### 範例
- 範例來說，當`code.version`設定為test時，會註冊TestHelloController的Bean，此時打/hello就會得到`Hello Test World!`的字串。
- 當`code.version`設定為prod時，會註冊HelloController的Bean，此時打/hello就會得到`Hello World!`的字串。