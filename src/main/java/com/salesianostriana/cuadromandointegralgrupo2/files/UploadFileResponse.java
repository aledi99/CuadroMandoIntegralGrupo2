package com.salesianostriana.cuadromandointegralgrupo2.files;



import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class UploadFileResponse {

	private String nombreFichero;
	private String uriDescargaFichero;
	private String tipoFichero;
	private long tamanyo;
	
	public UploadFileResponse(String nombreFichero, String uriDescargaFichero, String tipoFichero, long tamanyo) {
        this.nombreFichero = nombreFichero;
        this.uriDescargaFichero = uriDescargaFichero;
        this.tipoFichero = tipoFichero;
        this.tamanyo = tamanyo;
    }

}
