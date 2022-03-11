package com.asciimv.ui;

public class Tile {
	
	protected char character;
	
	protected float x;
	
	protected float y;
	
	/** The red value of the tile's color (0f to 1f).*/
	protected float red;
	
	/** The green value of the tile's color (0f to 1f).*/
	protected float green;
	
	/** The blue value of the tile's color (0f to 1f).*/
	protected float blue;
	
	/** The tile's row (i/y-axis) position within the grid array. */
	protected int row;
	
	/** The tile's column (j/x-axis) position within the grid array. */
	protected int column;
	
	public Tile() {
		this.character = '!';
		this.x = 0f;
		this.y = 0f;
		this.red = 0f;
		this.green = 0f;
		this.blue = 0f;
		this.row = 0;
		this.column = 0;
	}
	
	public Tile(char c) {
		this.character = c;
		this.x = 0f;
		this.y = 0f;
		this.red = 0f;
		this.green = 0f;
		this.blue = 0f;
		this.row = 0;
		this.column = 0;
	}
	
	public Tile(char c, float x, float y) {
		this.character = c;
		this.x = x;
		this.y = y;
		this.red = 0f;
		this.green = 0f;
		this.blue = 0f;
		this.row = 0;
		this.column = 0;
	}
	
	public Tile(char c, float x, float y, float r, float g, float b) {
		this.character = c;
		this.x = x;
		this.y = y;
		this.red = r;
		this.green = g;
		this.blue = b;
		this.row = 0;
		this.column = 0;
	}
	
	public Tile(char c, float x, float y, String hexcode) {
		this.character = c;
		this.x = x;
		this.y = y;
		this.setColor(hexcode);
		this.row = 0;
		this.column = 0;
	}

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getRed() {
		return red;
	}

	public void setRed(float red) {
		this.red = red;
	}

	public float getGreen() {
		return green;
	}

	public void setGreen(float green) {
		this.green = green;
	}

	public float getBlue() {
		return blue;
	}

	public void setBlue(float blue) {
		this.blue = blue;
	}
	
	public void setColor(String hexcode) {
		this.setRed(Integer.valueOf(hexcode.substring(1, 3), 16));
		this.setGreen(Integer.valueOf(hexcode.substring(3, 5), 16));
		this.setBlue(Integer.valueOf(hexcode.substring(5, 7), 16));
	}
	
	public int getRow()
	{
		return row;
	}

	public void setRow(int row)
	{
		this.row = row;
	}

	public int getColumn()
	{
		return column;
	}

	public void setColumn(int column)
	{
		this.column = column;
	}

	@Override
	public String toString(){
		return String.valueOf(this.character);
	}
}
