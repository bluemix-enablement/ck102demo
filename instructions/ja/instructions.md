${app}: 始めに
-----------------------------------
新しい Java キャッシュ・スターターへようこそ
               
IBM DataCache Java ネイティブ API を使用するこの Java キャッシュ・スターター・アプリケーションの入門情報を提供します。このアプリケーションでは、WebSphere eXtreme Scale テクノロジーが採用されています。

1. [cf コマンド・ライン・ツールをインストールします](${doc-url}/#starters/BuildingWeb.html#install_cf)。
2. [スターター・アプリケーション・パッケージをダウンロードします](${ace-url}/rest/apps/${app-guid}/starter-download)。
3. パッケージを解凍し、そのパッケージに `cd` で移動します。
4. Bluemix への接続:

		cf api ${api-url}

5. Bluemix へのログイン:

		cf login -u ${username}
		cf target -o ${org} -s ${space}
		
6. Java コードをコンパイルし、Ant を使用して war パッケージを生成します。
7. アプリのデプロイ:

		cf push ${app} -p cacheSampleJavaNativeAPIs.war


8. アプリへのアクセス: [http://${route}](http://${route})
9. また、スターター・アプリケーション・パッケージを Eclipse にインポートすること、および [IBM Eclipse Tools for Bluemix を使用してデプロイ](${doc-url}/#manageapps/eclipsetools.html#eclipsetools)することができます。
