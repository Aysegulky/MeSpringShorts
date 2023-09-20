package com.cydeo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("Office")
@Component
public class OfficeHoursService  implements ExtraSessions{

    @Override
    public int getHours() {
        return 5;
    }
}
