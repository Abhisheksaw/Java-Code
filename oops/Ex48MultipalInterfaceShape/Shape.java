package Ex48MultipalInterfaceShape;

interface Figure{
    double area();
}
interface Shape {
    String getName();
}

interface MyInterface extends Figure,Shape{

}
