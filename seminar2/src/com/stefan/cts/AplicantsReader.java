package com.stefan.cts;

import java.io.FileNotFoundException;
import java.util.List;

public interface AplicantsReader {
    List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException;
}
