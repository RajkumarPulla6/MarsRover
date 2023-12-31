package task;
import org.junit.Assert;
import org.junit.Test;
import sample.Direction;


public class RoverDirection {

	  

	    @Test
	    public void eastIsOnRightOfNorth() {
	        //Given
	        Direction north = Direction.N;

	        //When
	        Direction east = north.right();

	        //Then
	        Assert.assertEquals(Direction.E, east);
	        System.out.println("I m here east : " +east);
	    }
	    
	    @Test
	    public void westIsOnLeftOfNorth() {
	        //Given
	        Direction north = Direction.N;
	       	
	        //When
	        Direction west = north.left();
	        //Then
	        Assert.assertEquals(Direction.W, west);
	        System.out.println("I m here west : " +west);
	    }

	    @Test
	    public void northIsOnRightOfWest() {
	        //Given
	        Direction west = Direction.W;

	        //When
	        Direction north = west.right();

	        //Then
	        Assert.assertEquals(Direction.N, north);
	        System.out.println("I m here north : " +north);
	    }

	    @Test
	    public void southIsOnLeftOfWest() {
	        //Given
	        Direction west = Direction.W;

	        //When
	        Direction south = west.left();

	        //Then
	        Assert.assertEquals(Direction.S, south);
	        System.out.println("I m here south : " +south);
	    }

	    @Test
	    public void eastIsOnLeftOfSouth() {
	        //Given
	        Direction south = Direction.S;

	        //When
	        Direction east = south.left();

	        //Then
	        Assert.assertEquals(Direction.E, east);
	        System.out.println("I m here east : " +east);
	    }

	    @Test
	    public void westIsOnRightOfSouth() {
	        //Given
	        Direction south = Direction.S;

	        //When
	        Direction west = south.right();

	        //Then
	        Assert.assertEquals(Direction.W, west);
	        System.out.println("I m here west : " +west);
	    }

	    @Test
	    public void northIsOnLeftOfEast() {
	        //Given
	        Direction east = Direction.E;

	        //When
	        Direction north = east.left();

	        //Then
	        Assert.assertEquals(Direction.N, north);
	        System.out.println("I m here north : " +north);
	    }

	    @Test
	    public void southIsOnRightOfEast() {
	        //Given
	        Direction east = Direction.E;

	        //When
	        Direction south = east.right();

	        //Then
	        Assert.assertEquals(Direction.S, south);
	        System.out.println("I m here south : " +south);
	    }

	    @Test
	    public void eastIsOneStepForwardOnXAxis() {
	        //Given
	        Direction east = Direction.E;

	        //When
	        int stepSize = east.stepSizeForXAxis();

	        //Then
	        Assert.assertEquals(1, stepSize);
	        System.out.println("I m here stepSize: " +stepSize);
	    }

	    @Test
	    public void eastIsStationaryOnYAxis() {
	        //Given
	        Direction east = Direction.E;

	        //When
	        int stepSize = east.stepSizeForYAxis();

	        //Then
	        Assert.assertEquals(0, stepSize);
	        System.out.println("I m here : " +stepSize);
	    }

	    @Test
	    public void westIsOneStepBackOnXAxis() {
	        //Given
	        Direction west = Direction.W;

	        //When
	        int stepSize = west.stepSizeForXAxis();

	        //Then
	        Assert.assertEquals(-1, stepSize);
	        System.out.println("I m here : " +stepSize);
	    }


	    @Test
	    public void westIsStationaryOnYAxis() {
	        //Given
	        Direction west = Direction.W;

	        //When
	        int stepSize = west.stepSizeForYAxis();

	        //Then
	        Assert.assertEquals(0, stepSize);
	        System.out.println("I m here : " +stepSize);
	    }

	    @Test
	    public void northIsOneStepForwardOnYAxis() {
	        //Given
	        Direction north = Direction.N;

	        //When
	        int stepSize = north.stepSizeForYAxis();

	        //Then
	        Assert.assertEquals(1, stepSize);
	        System.out.println("I m here : " +stepSize);
	    }


	    @Test
	    public void northIsStationaryOnXAxis() {
	        //Given
	        Direction north = Direction.N;

	        //When
	        int stepSize = north.stepSizeForXAxis();

	        //Then
	        Assert.assertEquals(0, stepSize);
	        System.out.println("I m here : " +stepSize);
	    }

	    @Test
	    public void southIsOneStepBackOnYAxis() {
	        //Given
	        Direction south = Direction.S;

	        //When
	        int stepSize = south.stepSizeForYAxis();

	        //Then
	        Assert.assertEquals(-1, stepSize);
	        System.out.println("I m here : " +stepSize);
	    }

	    @Test
	    public void southIsStationaryOnXAxis() {
	        //Given
	        Direction south = Direction.S;

	        //When
	        int stepSize = south.stepSizeForXAxis();

	        //Then
	        Assert.assertEquals(0, stepSize);
	        System.out.println("I m here : " +stepSize);
	       
	      
	    }
	    
	    
	}



