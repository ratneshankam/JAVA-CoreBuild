// Real Time 

class Hospital {
    class Doctor {

    }
    class Medical {

    }
}

class Client {

    // It's not possible to create object of inner class without outer class object
    Hospital.Doctor obj = new Hospital().new Doctor();
}