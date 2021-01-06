package practice9;

public class practice9_6 {
	public static void main(String[] args) {	
		StopWatch object=new StopWatch();
		int[] n=new int[100000];
		for(int i=0; i<100000; i++) {
			n[i]=(int) (Math.random()*100);
		}
		
		selectionSort(n);
		
		object.Stop(object.getElapsedTime());
 
		long executeTime=object.getEndTime()-object.getStartTime();  
		System.out.println("执行时间为： "+executeTime+" Milliseconds.");
	}
	
	public static void selectionSort(int[] list) {
		
		for(int i=0;i<list.length-1;i++){
			int currentMax=list[i];
			int currentMaxIndex=i;
			
			for(int j=i+1;j<list.length;j++){
				if(currentMax<list[j]){
					currentMax=list[j];
					currentMaxIndex=j;
				}
			}
			if(currentMaxIndex !=i){
				list[currentMaxIndex]=list[i];
				list[i]=currentMax;
			}
		}
		for(int i1=0; i1<list.length; i1++) {
			System.out.print(" "+list[i1]);
		}
	}
}

class StopWatch {
	 
	private long startTime;
	private long endTime;
	
	public StopWatch() {
		java.util.Date date=new java.util.Date();
		startTime=date.getTime();
	}
	
	public void start(long startTime) {
		 this.startTime=startTime;
	}
	
	public void Stop(long endTime) {
		this.endTime=endTime;
	}
	
	
	public long getElapsedTime() {
		java.util.Date time=new java.util.Date(); 
		return time.getTime();
		
	}
	
	public long getStartTime() {
		return startTime;
		
	}	
	public long getEndTime() {
		return endTime;		
	}
}


