package cz.czechitas.java2webapps.ukol3.service;

import cz.czechitas.java2webapps.ukol3.entity.BusinessCard;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BusinessCardService {
    private final List<BusinessCard> businessCardList = new ArrayList<>();

    public BusinessCardService() {
        businessCardList.add(new BusinessCard("Dita (Přikrylová) Formánková", "Czechitas z.s.", "Václavské náměstí 837/11", "11000 Praha1", "dita@czechitas.cz", "+420 800123456", "czechitas.cz"));
        businessCardList.add(new BusinessCard("Barbora Bühnová", "Czechitas z.s.", "Bystré 911", "74401 Frenštát pod Radhoštěm", null, "+420 800123456", "czechitas.cz"));
        businessCardList.add(new BusinessCard("Monika Ptáčníková", "Czechitas z.s.", "Sídliště Osvobození 779", "69144 Lednice na Moravě", "monika@czechitas.cz", "+420 800123456", "czechitas.cz"));
        businessCardList.add(new BusinessCard("Mirka Zatloukalová", "Czechitas z.s.", "Valtická 337", "69144 Lednice na Moravě", "mirka@czechitas.cz", null, "czechitas.cz"));
    }

    public List<BusinessCard> getAll() {
        return businessCardList;
    }

    public BusinessCard getById(int id) {
        if (id >= 0 && id < businessCardList.size()) {
            return businessCardList.get(id);
        } else {
            return null;
        }
    }
}
