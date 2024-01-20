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
│  MiniCServiceApplication.java
│
├─api
│      CommonResult.java
│      IErrorCode.java
│      ResultCode.java
│
├─config
├─controller
│      MiniCParserController.java
│
├─parser
│      JJTMiniCParserState.java
│      MiniCParser.java
│      MiniCParser.jj
│      MiniCParser.jjt
│      MiniCParserConstants.java
│      MiniCParserTokenManager.java
│      MiniCParserTreeConstants.java
│      Node.java
│      ParseException.java
│      SimpleCharStream.java
│      SimpleNode.java
│      Token.java
│      TokenMgrError.java
│
├─service
│      MiniCService.java
│
└─util
        ConditionValue.java
        QTInfo.java
        QTList.java
        Variable.java
        VariableNameGenerator.java
        VariableTable.java
```



### 项目截图

![web](https://github.com/mmdxiaoxin/MiniC-service/blob/master/README.assets/web.png)

### 文法规则

| Start                    | ::=  | [Program](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod2) |
| ------------------------ | ---- | ------------------------------------------------------------ |
| Program                  | ::=  | ( <VOID> \| <INT> ) <MAIN> <LEFT_PAREN> <RIGHT_PAREN> <LEFT_BRACE> ( [StatementBlock](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod3) )* <RIGHT_BRACE> |
| TypeSpecifier            | ::=  | <INT>                                                        |
|                          | \|   | <DOUBLE>                                                     |
|                          | \|   | <VOID>                                                       |
|                          | \|   | <FLOAT>                                                      |
|                          | \|   | <CHAR>                                                       |
|                          | \|   | <LONG>                                                       |
|                          | \|   | <SHORT>                                                      |
| StatementBlock           | ::=  | [Statement](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod5) |
|                          | \|   | <LEFT_BRACE> ( [StatementBlock](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod3) )* <RIGHT_BRACE> |
| Statement                | ::=  | [SequenceStatement](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod6) |
|                          | \|   | [ConditionStatement](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod7) |
|                          | \|   | [WhileStatement](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod8) |
|                          | \|   | [DoWhileStatement](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod9) |
|                          | \|   | [SwitchCStatement](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod10) |
|                          | \|   | [ForStatement](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod11) |
| SequenceStatement        | ::=  | [DeclarationStatement](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod12) <SEMICOLON> |
|                          | \|   | [AssignmentStatement](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod13) <SEMICOLON> |
|                          | \|   | [ReturnStatement](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod14) <SEMICOLON> |
|                          | \|   | [SelfIncreasing](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod15) <SEMICOLON> |
| ReturnStatement          | ::=  | <RETURN> [Expression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod16) |
| DeclarationStatement     | ::=  | [TypeSpecifier](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod4) [parseIdentifier](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod17) ( <COMMA> [parseIdentifier](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod17) )* |
| AssignmentStatement      | ::=  | [parseIdentifier](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod17) <ASSIGN> [Expression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod16) |
| ORExpression             | ::=  | [ANDExpression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod19) ( "\|\|" [ANDExpression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod19) )* |
| ANDExpression            | ::=  | [NOTExpression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod20) ( <AND> [NOTExpression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod20) )* |
| NOTExpression            | ::=  | ( <NOT> )? [RelationExpression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod21) |
| RelationExpression       | ::=  | [Expression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod16) ( [Rop](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod22) [Expression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod16) )? |
| ConditionStatement       | ::=  | <IF> <LEFT_PAREN> [ORExpression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod18) <RIGHT_PAREN> [StatementBlock](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod3) ( <ELSE> [StatementBlock](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod3) )? |
| WhileStatement           | ::=  | <WHILE> <LEFT_PAREN> [ORExpression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod18) <RIGHT_PAREN> [StatementBlock](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod3) |
| Rop                      | ::=  | <LESS_THAN>                                                  |
|                          | \|   | <LESS_THAN_EQUAL>                                            |
|                          | \|   | <GREATER_THAN>                                               |
|                          | \|   | <GREATER_THAN_EQUAL>                                         |
| Expression               | ::=  | [AdditiveExpression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod23) |
| AdditiveExpression       | ::=  | [MultiplicativeExpression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod24) ( ( "+" \| "-" ) [MultiplicativeExpression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod24) )* |
| MultiplicativeExpression | ::=  | [UnaryExpression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod25) ( ( "*" \| "/" \| "%" ) [UnaryExpression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod25) )* |
| UnaryExpression          | ::=  | ( <LEFT_PAREN> [Expression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod16) <RIGHT_PAREN> \| [parseIdentifier](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod17) \| [parseInteger](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod26) ) |
| parseIdentifier          | ::=  | <IDENTIFIER>                                                 |
| parseInteger             | ::=  | <INTEGER_LITERAL>                                            |
| SwitchCStatement         | ::=  | <SWITCH> <LEFT_PAREN> [parseIdentifier](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod17) <RIGHT_PAREN> <LEFT_BRACE> ( <CASE> <INTEGER_LITERAL> <COLON> [CaseStatementBlock](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod27) )* ( <DFLT> <COLON> ( [StatementBlock](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod3) )? <BREAK> <SEMICOLON> )? <RIGHT_BRACE> |
| CaseStatementBlock       | ::=  | [Statement](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod5) <BREAK> <SEMICOLON> |
|                          | \|   | <LEFT_BRACE> ( [StatementBlock](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod3) <BREAK> <SEMICOLON> )* <RIGHT_BRACE> |
| DoWhileStatement         | ::=  | <DO> ( [StatementBlock](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod3) ) <WHILE> <LEFT_PAREN> [ORExpression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod18) <RIGHT_PAREN> <SEMICOLON> |
| ForStatement             | ::=  | <FOR> <LEFT_PAREN> ( [DeclarationStatement](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod12) \| [AssignmentStatement](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod13) )? <SEMICOLON> [RelationExpression](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod21) <SEMICOLON> ( [SelfIncreasing](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod15) \| [AssignmentStatement](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod13) )* <RIGHT_PAREN> [StatementBlock](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod3) |
| SelfIncreasing           | ::=  | ( [parseIdentifier](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod17) ( <INCREMENT> \| <DECREMENT> ) ) |
|                          | \|   | ( ( <INCREMENT> \| <DECREMENT> ) [parseIdentifier](file:///D:/mycode/JAVA/eclipse-2019/MiniC_compiler/MiniCParser.html#prod17) ) |
