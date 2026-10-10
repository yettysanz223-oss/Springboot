package com.ejemplo.dto_mapstruct.mapper;

import com.ejemplo.dto_mapstruct.dto.ProductoDTO;
import com.ejemplo.dto_mapstruct.entity.Producto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-10T13:56:17-0500",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.46.100.v20260826-1225, environment: Java 21.0.12.1 (Eclipse Adoptium)"
)
@Component
public class ProductoMapperImpl implements ProductoMapper {

    @Override
    public ProductoDTO toDTO(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoDTO productoDTO = new ProductoDTO();

        productoDTO.setNombre( producto.getNombre() );
        productoDTO.setPrecio( producto.getPrecio() );

        return productoDTO;
    }

    @Override
    public Producto toEntity(ProductoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Producto producto = new Producto();

        producto.setNombre( dto.getNombre() );
        producto.setPrecio( dto.getPrecio() );

        return producto;
    }
}
