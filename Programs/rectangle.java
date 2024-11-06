class Rectangle{
	double length;
	double width;
	
	Rectangle(double length,double width){
		this.length = length;
		this.width = width;
	}
	void resizeRectangle(Rectangle rect,double newLength,double newWidth){
		rect.length = newLength;
		rect.width = newWidth;
	}
}
