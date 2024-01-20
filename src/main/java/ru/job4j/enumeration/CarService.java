package ru.job4j.enumeration;

public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Статус Toyota: " + toyota.getInfo());
        System.out.println("Статус Volvo: " + volvo.getInfo());
        Order order1 = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        System.out.println("Заказ-наряд №" + order1.getNumber() + " на автомобиль " + order1.getCar()
                + ", статус ремонта: " + order1.getStatus().getInfo());
        Order order2 = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        System.out.println("Заказ-наряд №" + order2.getNumber() + " на автомобиль " + order2.getCar()
                + ", статус ремонта: " + order2.getStatus().getInfo() + ", подробности: "
                + order2.getStatus().getMessage());
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println("Название статуса: " + s.name() + ", Порядковый номер статуса: " + s.ordinal());
        }
        String accepted = "IN_WORK";
        Status status = Status.valueOf(accepted);
        System.out.println(status);
        switch (status) {
            case ACCEPTED:
                System.out.println("Статус: Автомобиль принят на СТО");
                break;
            case IN_WORK:
                System.out.println("Статус: Автомобиль в работе");
                break;
            case WAITING:
                System.out.println("Статус: Автомобиль ожидает запчасти");
                break;
            case FINISHED:
                System.out.println("Статус: Все работы завершены");
                break;
            default:
        }
    }
}