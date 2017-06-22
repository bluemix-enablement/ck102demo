開始使用 ${app}
-----------------------------------
歡迎使用您的新 Java Cache Starter！
               
開始使用這個 Java Cache Starter 應用程式，它使用 IBM DataCache Java 原生 API，並採用 WebSphere eXtreme Scale 技術。

1. [安裝 cf 指令行工具](${doc-url}/#starters/BuildingWeb.html#install_cf)。
2. [下載入門範本應用程式套件](${ace-url}/rest/apps/${app-guid}/starter-download)。
3. 解開套件並 `cd` 到該處。
4. 連接至 Bluemix：

		cf api ${api-url}

5. 登入 Bluemix：

		cf login -u ${username}
		cf target -o ${org} -s ${space}
		
6. 編譯 Java 程式碼並使用 ant 產生 war 套件。
7. 部署您的應用程式：

		cf push ${app} -p cacheSampleJavaNativeAPIs.war


8. 存取您的應用程式：[http://${route}](http://${route})
9. 您也可以將入門範本應用程式套件匯入至 Eclipse，並[使用 IBM Eclipse Tools for Bluemix 進行部署](${doc-url}/#manageapps/eclipsetools.html#eclipsetools)。
