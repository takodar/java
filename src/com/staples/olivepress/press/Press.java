package com.staples.olivepress.press;

import java.util.Collection;
import com.staples.olivepress.olives.Olive;

//INTERFACE EXAMPLE
public interface Press {
	public void getOil(Collection<Olive> olives);
	public int getTotalOil();
	public void setTotalOil(int totalOil);
}
