public class FPScounter {

    private int currentFPS = 0;
    private int FPS = 0;
    private long start = 0;

    public void tick() {
        if(System.currentTimeMillis() - start >= 1000) {
            FPS = currentFPS;
            currentFPS = 0;
            start = System.currentTimeMillis();
        }
        else currentFPS++;
    }
    
    public int getFPS() {
        return FPS;
    }
    
	public String tellFPS(){
    	return "fps: "+getFPS();  
	}
}