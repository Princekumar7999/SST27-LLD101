public class FrameCache {
    private Frame lastFrame;
    
    public void cacheFrame(Frame frame) {
        this.lastFrame = frame;
    }
    
    public boolean hasCachedFrame() {
        return lastFrame != null;
    }
} 