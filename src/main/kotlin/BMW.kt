class BMW(model:String,color:String, speed:Double):Car(model,color,speed) {

    override fun getFuelType(): String {
        return "Petrol"
    }
}