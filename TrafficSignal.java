package com.exercise.in;

public enum TrafficSignal {
         
	    RED{
	        @Override
	        public void action(){
	            System.out.println("STOP");
	        }
	    }, 
	    GREEN{
	        @Override
	        public void action(){
	            System.out.println("GO");
	        }
	    }, 
	    ORANGE{
	        @Override
	        public void action(){
	            System.out.println("SLOW DOWN");
	        }
	    };

    public abstract void action();
public static void main(StringTest[]args)
{
	TrafficSignal o1=TrafficSignal.RED;
	o1.action();
	TrafficSignal o2=TrafficSignal.GREEN;
	o2.action();
	TrafficSignal o3=TrafficSignal.ORANGE;
	o3.action();
	
}
}
