package game.renderLayers;

import gameEngine.interfaces.RenderLayer;

import java.util.ArrayList;
import java.util.List;

public class RenderLayerList {
	
	private static List<RenderLayer> RenderLayers = new ArrayList<RenderLayer>();
	
	
	public static void AddLayers(){
		RenderLayers.add(new GameRender());
		RenderLayers.add(new DebugRender());
		
		
	}
	
	public static List<RenderLayer> getRenderLayers() {
		return RenderLayers;
	}

}
