public class FPScounter {

    private int currentFPS = 0;
    private int FPS = 0;
    private int max;
    private long start = 0;

    public void tick() {
        if(System.currentTimeMillis() - start >= 1000) {
            FPS = currentFPS;
            if(max<FPS)max=FPS;
            currentFPS = 0;
            start = System.currentTimeMillis();
        }
        else currentFPS++;
    }
    
    public int getFPS() {
        return FPS;
    }
    
	public String tellFPS(){
    	return "FPS: "+getFPS();  
	}
	
	public String maxFPS(){
		return "Max FPS:"+max;
		
	}
	
}