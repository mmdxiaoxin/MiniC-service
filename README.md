# MiniC在线编译器 - Spring Boot项目

该项目是一个简单的MiniC编程语言在线编译器，使用Spring Boot实现。MiniC是C编程语言的一个子集，该编译器提供了一个基于Web的界面，用户可以输入MiniC代码，进行编译，并查看结果。

## 部署方法

### 1. 环境准备

确保你的开发环境中具有以下要求：

- Java Development Kit (JDK) 17或更高版本
- Maven构建工具
- 一个支持Spring Boot应用程序的集成开发环境（IDE），如IntelliJ IDEA或Eclipse

### 2. 下载代码

通过克隆或下载项目代码，将其保存到本地。

```bash
git clone https://github.com/your-username/your-repository.git
```

### 3. 进入项目目录

```bash
cd your-repository
```

### 4. 编译与打包

使用Maven命令编译和打包项目。

```bash
mvn clean package
```

### 5. 运行应用程序

执行以下命令来启动Spring Boot应用程序。

```baash
java -jar target/your-application.jar
```

替换 `your-application.jar` 为实际生成的JAR文件名。

### 6. 访问在线编译器

打开浏览器，访问 `http://localhost:8080`，你将看到MiniC在线编译器的主页。

## 项目结构

```bash
.
│  .gitignore
│  input5.txt
│  mvnw
│  mvnw.cmd
│  output5.txt
│  pom.xml
│
├─.idea
│  │  .gitignore
│  │  compiler.xml
│  │  dataSources.local.xml
│  │  dataSources.xml
│  │  encodings.xml
│  │  jarRepositories.xml
│  │  misc.xml
│  │  uiDesigner.xml
│  │  vcs.xml
│  │  workspace.xml
│  │
│  ├─dataSources
│  │  │  e4d71c56-0114-480a-b79e-9d287db88137.xml
│  │  │
│  │  └─e4d71c56-0114-480a-b79e-9d287db88137
│  │      └─storage_v2
│  │          └─_src_
│  │              └─schema
│  │                      information_schema.FNRwLQ.meta
│  │                      miniparser.NoMx7Q.meta
│  │                      mysql.osA4Bg.meta
│  │                      performance_schema.kIw0nw.meta
│  │                      sys.zb4BAA.meta
│  │
│  └─httpRequests
│          http-client.cookies
│          http-requests-log.http
│
├─.mvn
│  └─wrapper
│          maven-wrapper.jar
│          maven-wrapper.properties
│
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─mmdxiaoxin
│  │  │          └─minicservice
│  │  │              │  MiniCServiceApplication.java
│  │  │              │
│  │  │              ├─api
│  │  │              │      CommonResult.java
│  │  │              │      IErrorCode.java
│  │  │              │      ResultCode.java
│  │  │              │
│  │  │              ├─config
│  │  │              ├─controller
│  │  │              │      MiniCParserController.java
│  │  │              │
│  │  │              ├─parser
│  │  │              │      JJTMiniCParserState.java
│  │  │              │      MiniCParser.java
│  │  │              │      MiniCParser.jj
│  │  │              │      MiniCParser.jjt
│  │  │              │      MiniCParserConstants.java
│  │  │              │      MiniCParserTokenManager.java
│  │  │              │      MiniCParserTreeConstants.java
│  │  │              │      Node.java
│  │  │              │      ParseException.java
│  │  │              │      SimpleCharStream.java
│  │  │              │      SimpleNode.java
│  │  │              │      Token.java
│  │  │              │      TokenMgrError.java
│  │  │              │
│  │  │              ├─service
│  │  │              │      MiniCService.java
│  │  │              │
│  │  │              └─util
│  │  │                      ArrayInfo.java
│  │  │                      ConditionValue.java
│  │  │                      QTInfo.java
│  │  │                      QTList.java
│  │  │                      QTTable.java
│  │  │                      StatementType.java
│  │  │                      Variable.java
│  │  │                      VariableNameGenerator.java
│  │  │                      VariableTable.java
│  │  │
│  │  └─resources
│  │      │  application.properties
│  │      │
│  │      ├─static
│  │      └─templates
│  │              index.html
│  │              parser.html
│  │
│  └─test
│      └─java
│          └─com
│              └─mmdxiaoxin
│                  └─minicservice
│                          MiniCServiceApplicationTests.java
│
└─target
    ├─classes
    │  │  application.properties
    │  │
    │  ├─com
    │  │  └─mmdxiaoxin
    │  │      └─minicservice
    │  │          │  MiniCServiceApplication.class
    │  │          │
    │  │          ├─api
    │  │          │      CommonResult.class
    │  │          │      IErrorCode.class
    │  │          │      ResultCode.class
    │  │          │
    │  │          ├─controller
    │  │          │      MiniCParserController.class
    │  │          │
    │  │          ├─parser
    │  │          │      JJTMiniCParserState.class
    │  │          │      MiniCParser.class
    │  │          │      MiniCParserConstants.class
    │  │          │      MiniCParserTokenManager.class
    │  │          │      MiniCParserTreeConstants.class
    │  │          │      Node.class
    │  │          │      ParseException.class
    │  │          │      SimpleCharStream.class
    │  │          │      SimpleNode.class
    │  │          │      Token.class
    │  │          │      TokenMgrError.class
    │  │          │
    │  │          ├─service
    │  │          │      MiniCService.class
    │  │          │
    │  │          └─util
    │  │                  ArrayInfo.class
    │  │                  ConditionValue.class
    │  │                  QTInfo.class
    │  │                  QTList.class
    │  │                  QTTable.class
    │  │                  StatementType.class
    │  │                  Variable.class
    │  │                  VariableNameGenerator.class
    │  │                  VariableTable.class
    │  │
    │  └─templates
    │          index.html
    │          parser.html
    │
    ├─generated-sources
    │  └─annotations
    ├─generated-test-sources
    │  └─test-annotations
    └─test-classes
        └─com
            └─mmdxiaoxin
                └─minicservice
                        MiniCServiceApplicationTests.class
```

请注意，项目的主要结构包括源代码（src目录）、资源文件（resources目录）、测试代码（test目录）、以及构建和编译生成的文件（target目录）。前端页面位于`src/main/resources/templates`目录下。