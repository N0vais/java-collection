package Collection;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    //atributo

    private static Map<LocalDate, Eventos> eventosMap;

    public AgendaEventos(){
        AgendaEventos.eventosMap = new HashMap<>();
    }
    
    public static void adicionarEvento(LocalDate data, String nome, String atracao){
        Eventos eventos = new Eventos(nome, atracao);
        eventosMap.put(data, eventos);
    }

    public void axibirAgenda(){
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dateSet = eventosMap.keySet();
        Collection<Eventos> values = eventosMap.values();*/

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Eventos proximoEvento = null;
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);

        for (Map.Entry<LocalDate, Eventos> entry : eventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + "acontecera na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        AgendaEventos.adicionarEvento(LocalDate.of(2022, Month.MARCH , 23), "Evento 1", "Atraçao 1");
        AgendaEventos.adicionarEvento(LocalDate.of(2002, Month.SEPTEMBER , 3), "Evento 2", "Atraçao 2");
        AgendaEventos.adicionarEvento(LocalDate.of(2012, Month.JULY, 25), "Evento 3", "Atraçao 3");

        agendaEventos.axibirAgenda();
        //System.out.println(agendaEventos);

        //System.out.println(LocalDate.now());
    }
    
}
