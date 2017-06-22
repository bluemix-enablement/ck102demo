${app} 入门
-----------------------------------
欢迎使用新 Java Cache Starter！
               
此 Java Cache Starter 应用程序的入门，该应用程序使用 IBM DataCache Java 本地 API，基于 WebSphere eXtreme Scale 技术。

1. [安装 cf 命令行工具](${doc-url}/#starters/BuildingWeb.html#install_cf)。
2. [下载起动器应用程序包](${ace-url}/rest/apps/${app-guid}/starter-download)。
3. 将程序包和 `cd` 抽取到它。
4. 连接到 Bluemix：

		cf api ${api-url}

5. 登录到 Bluemix：

		cf login -u ${username}
		cf target -o ${org} -s ${space}
		
6. 编译 Java 代码并使用 ant 生成 war 程序包。
7. 部署您的应用程序：

		cf push ${app} -p cacheSampleJavaNativeAPIs.war


8. 访问您的应用程序：[http://${route}](http://${route})
9. 您还可以将起动器应用程序包导入到 Eclipse 并[使用 IBM Eclipse Tools for Bluemix 部署](${doc-url}/#manageapps/eclipsetools.html#eclipsetools)。
