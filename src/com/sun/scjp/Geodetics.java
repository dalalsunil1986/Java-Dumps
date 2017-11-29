package com.sun.scjp;

public class Geodetics {
	public static final double DIAMETER = 12756.32; // kilometerss
}
/*
 * Which two correctly access the DIAMETER member of the Geodetics class?
 *Answer is::::::===A,C Ok!!!!! 
 * A.import com.sun.scjp.Geodetics; public class TerraCarta { public double
 * halfway() { return Geodetics.DIAMETER/2.0; }
 * 
 * C.import static com.sun.scjp.Geodetics.*; public class TerraCarta { public
 * double halfway() { return DIAMETER/2.0; } }
 */