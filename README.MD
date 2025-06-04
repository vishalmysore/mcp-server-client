## MCP Server and Client Example 

This server is designed to work as both an A2A (Application-to-Application) and MCP (Message Communication Protocol) server. It can connect to any client, whether MCP or A2A. Additionally, a Java client is included in this repository for testing purposes.

You can also use curl commands to test the server functionality.

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
