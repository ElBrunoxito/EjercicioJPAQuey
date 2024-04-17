package com.yobrunox.ejercicio_pc.repository;

import com.yobrunox.ejercicio_pc.dto.Dispositivo_MinutosJuegoDTO;
import com.yobrunox.ejercicio_pc.models.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Repository
public interface DispositivoRepository extends JpaRepository<Dispositivo,Integer> {
    @Query(value= "SELECT NEW com.yobrunox.ejercicio_pc.dto.Dispositivo_MinutosJuegoDTO(D.nombre, SUM(Ap.tiempoUsoMinutos)) " +
            "FROM Dispositivo D INNER JOIN D.apps Ap " +
            "WHERE Ap.Tipo = 'Juego' " +
            "GROUP BY D.id" , nativeQuery = false)
    List<Dispositivo_MinutosJuegoDTO> getDispositivo_MinutosJuegoPorMinutosDeAppJuego();

    @Query(value = "SELECT COUNT(D) FROM Dispositivo D WHERE D.fechaCompra BETWEEN :FInicio AND :FFin", nativeQuery = false)
    Long getPorTotaldeDispoEnUnTiempo(@Param("FInicio") Date FInicio,@Param("FFin")Date FFin);

}
