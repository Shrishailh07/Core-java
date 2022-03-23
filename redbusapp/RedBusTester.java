package com.xworkz.redbusapp;
import com.xworkz.redbusapp.contract.RedBusContract;
import com.xworkz.redbusapp.agency.Travelagency;
import com.xworkz.redbusapp.srs.SrsImplementation;
public class RedBusTester 
{

		public static void main(String[] args) {
			  RedBusContract busContract=new SrsImplementation();
			  
			  Travelagency agency=new Travelagency(busContract);
			  
			  agency.booking(23);
		}

	}

