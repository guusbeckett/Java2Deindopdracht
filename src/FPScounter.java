public class FPScounter {

    private int currentFPS = 0;
    private int FPS = 0;
    private int max;
    private int min = 60;
    private long start = 0;

    public void tick() {
        if(System.currentTimeMillis() - start >= 1000) {
//          if(max<currentFPS)max=currentFPS;
        	FPS = currentFPS;
        	if(max<FPS)max=FPS;
        	if(min!=0&&min>FPS)min=FPS;
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
	
	public String minFPS(){
		return "Mix FPS:"+min;
		
	}
}