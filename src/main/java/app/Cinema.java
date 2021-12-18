package app;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Cinema {
    private String nome;
    private String genero;
    private String autor;
}
