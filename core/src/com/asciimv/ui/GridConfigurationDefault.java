package com.asciimv.ui;

public class GridConfigurationDefault extends GridConfiguration
{

	public GridConfigurationDefault()
	{
		super(new GridRendererDefault(), 64, 41, 10, 0, -3, 10, 12);	
	}
	
	public GridConfigurationDefault(GridRenderer gr) {
		super(gr, 64, 41, 10, 0, -3, 10, 12);
	}
}
