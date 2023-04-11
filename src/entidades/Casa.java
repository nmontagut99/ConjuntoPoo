package entidades;

public class Casa {
    private Boolean arrendada;
    private int habitaciones;
    private int banios;// en programacion no existe la ñ
    private String numeroCasa;
    private Boolean parqueadero;

    public Casa(Boolean arrendada, int habitaciones, int banios, String numeroCasa, Boolean parqueadero) {
        this.arrendada = arrendada;
        this.habitaciones = habitaciones;
        this.banios = banios;
        this.numeroCasa = numeroCasa;
        this.parqueadero = parqueadero;
    }

    public Casa() {
    }

    public Boolean getArrendada() {
        return arrendada;
    }

    public void setArrendada(Boolean arrendada) {
        this.arrendada = arrendada;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String manzana) {
        this.numeroCasa = manzana;
    }

    public Boolean getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Boolean parqueadero) {
        this.parqueadero = parqueadero;
    }

}
