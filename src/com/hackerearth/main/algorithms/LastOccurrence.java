package com.hackerearth.main.algorithms;

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LastOccurrence {

	public static void main( String args[] ) throws Exception {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String[] line1 = br.readLine().split( " " );
		int N = Integer.parseInt( line1[0] );
		int M = Integer.parseInt( line1[1] );

		String[] line2 = br.readLine().split( " " );
		int[] array = new int[N];
		for ( int i = 0; i < line2.length; i++ ) {
			array[i] = Integer.parseInt( line2[i] );
		}

		int i = array.length - 1;
		int found = -1;
		do {
			if ( array[i] == M ) {
				found = i;
				break;
			}
			i--;
		} while ( i > 0 );

		System.out.println( found );
	}
}
