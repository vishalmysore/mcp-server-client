package org.example.client;

import io.github.vishalmysore.common.AgentInfo;
import io.github.vishalmysore.mcp.client.MCPAgent;
import io.github.vishalmysore.mcp.domain.CallToolResult;
import lombok.extern.java.Log;

@Log
public class MCPClient {
    public static void main(String[] args) {

        MCPAgent mcpAgent = new MCPAgent();
        mcpAgent.connect("https://vishalmysore-a2amcpspring.hf.space/");
        AgentInfo mcpCard = mcpAgent.getInfo();
        log.info("Connected to MCP server: " + mcpCard);


        CallToolResult result = (CallToolResult) mcpAgent.remoteMethodCall("holdBook", "vishal needs to read harry potter book 1");
        log.info("Tool call result: " + result);
    }
}
