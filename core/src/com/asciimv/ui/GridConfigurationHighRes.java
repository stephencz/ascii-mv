package com.asciimv.ui;

public class GridConfigurationHighRes extends GridConfiguration
{

	public GridConfigurationHighRes()
	{
		super(new GridRendererDefault(), 64, 41, 6, 0, -3, 10, 12);	
	}
	
	public GridConfigurationHighRes(GridRenderer gr) {
		super(gr, 128, 83, 6, 0, -3, 5, 6);
	}
}
