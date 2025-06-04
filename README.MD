## MCP Server and Client Example 

This server is designed to work as both an A2A (Agent-to-Agent) and MCP (Model Context Protocol) server:
- A2A: Google's Agent-to-Agent protocol for communication between AI agents
- MCP: Model Context Protocol for interaction with AI models and tools

The server can connect to any client using either protocol. Additionally, Java client implementations for both protocols are included in this repository for testing purposes.

### Java Clients

Two Java client implementations are available in the `src/main/java/org/example/client` package:
1. `A2AClient.java` - Google's Agent-to-Agent protocol implementation for AI agent communication
2. `MCPClient.java` - Model Context Protocol implementation for AI model interactions

You can use either client based on your protocol needs.

### Starting the Server

1. Build the project using Maven:
```bash
mvn clean install
```

2. Run the application:
```bash
mvn spring-boot:run
```

The server will start and listen on `http://localhost:7860`

### Testing with curl commands

You can use curl commands to test the server functionality.

### Get the list of tools

Use the following curl command to retrieve the list of tools:

curl -H "Content-Type: application/json" \
-d '{"jsonrpc":"2.0","method":"tools/list","params":{},"id":9}' \
http://localhost:7860/

### Call a tool

Use the following curl command to call a tool:

curl \
-H "Content-Type: application/json" \
-d '{
"jsonrpc": "2.0",
"method": "tools/call",
"params": {
"name": "holdBook",
"arguments": {
"provideAllValuesInPlainEnglish": {
"name": "harry potter and the prisoner of azkaban",
"user": "Vishal Mysore"
}
}
},
"id": 25
}' \
http://localhost:7860/


for a2a 

curl -u http://localhost:7860/.well-known/agent.json