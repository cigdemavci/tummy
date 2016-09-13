/*
 * Copyright 2015 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.tummy.provider;

import android.net.Uri;

import com.example.android.tummy.common.Attraction;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.SphericalUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Static data content provider.
 */
public class TouristAttractions {

    public static final String CITY_SYDNEY = "Sydney";

    public static final String TEST_CITY = CITY_SYDNEY;

    private static final float TRIGGER_RADIUS = 2000; // 2KM
    private static final int TRIGGER_TRANSITION = Geofence.GEOFENCE_TRANSITION_ENTER |
            Geofence.GEOFENCE_TRANSITION_EXIT;
    private static final long EXPIRATION_DURATION = Geofence.NEVER_EXPIRE;

    public static final Map<String, LatLng> CITY_LOCATIONS = new HashMap<String, LatLng>() {{
        put(CITY_SYDNEY, new LatLng(-33.873651, 151.2068896));
    }};

    /**
     * All photos used with permission under the Creative Commons Attribution-ShareAlike License.
     */
    public static final HashMap<String, List<Attraction>> ATTRACTIONS =
            new HashMap<String, List<Attraction>>() {{

        put(CITY_SYDNEY, new ArrayList<Attraction>() {{
            add(new Attraction(
                    "Appel Flap",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti. Suspendisse scelerisque risus justo, non tincidunt nibh blandit et. Vivamus elit lacus, luctus nec erat in, pharetra semper turpis. Quisque viverra nulla ligula, non pulvinar ante dictum sit amet. Vestibulum aliquet tortor mauris, vel suscipit nisl malesuada eget. Aliquam maximus dictum euismod. Maecenas leo quam, volutpat id diam eget, placerat fringilla ipsum. Nam pretium vehicula augue quis euismod.\n\nNam sed blandit magna. Vestibulum a fermentum arcu. Vestibulum et ligula at nisi luctus facilisis. Proin fermentum enim a nibh commodo finibus. Suspendisse justo elit, vulputate ut ipsum at, pellentesque auctor massa. Praesent vestibulum erat interdum imperdiet dapibus. In hac habitasse platea dictumst. Proin varius orci vitae tempor vulputate.\n\nEtiam sed mollis orci. Integer et ex sed tortor scelerisque blandit semper id libero. Nulla facilisi. Pellentesque tempor magna eget massa ultrices, et efficitur lectus finibus.",
                    Uri.parse("https://upload.wikimedia.org/wikipedia/commons/7/7f/Appelflap.jpg"),
                    Uri.parse("https://upload.wikimedia.org/wikipedia/commons/7/7f/Appelflap.jpg"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Bitter Ballen",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada. Mauris non nisi est. Nunc in ipsum euismod, suscipit dolor eget, efficitur nisi. Integer venenatis mauris mauris, quis luctus risus pellentesque a. Duis tempus est at ligula vehicula fermentum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n\nNam ut sodales nibh, euismod aliquet lectus. Curabitur ornare dictum nisi, at faucibus magna. Morbi tempus nibh sed sodales volutpat. Etiam sodales, turpis sit amet porttitor tristique, libero libero faucibus est, viverra dictum risus ipsum vel augue. Nulla dolor magna, iaculis ac ornare id, fermentum eget massa. Sed mattis, odio nec sodales vehicula, neque metus ullamcorper nulla, sit amet ullamcorper risus lectus a ipsum. Curabitur venenatis feugiat quam nec elementum. Curabitur a interdum urna. Curabitur tincidunt tortor eget neque condimentum blandit. Etiam imperdiet, enim nec blandit convallis, nunc augue.",
                    Uri.parse("https://upload.wikimedia.org/wikipedia/commons/8/89/Bitterballen_mosterd_mayo.jpg"),
                    Uri.parse("https://upload.wikimedia.org/wikipedia/commons/8/89/Bitterballen_mosterd_mayo.jpg"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Pumpkin Soup",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio. Nam posuere nunc sed risus molestie varius. Suspendisse posuere faucibus urna, id vestibulum ante iaculis et. Vivamus placerat suscipit sem, a tempor nunc vehicula ac. Ut libero velit, dapibus sit amet euismod vel, dignissim a nisl.\n\nDonec non dui non felis laoreet malesuada. Fusce ac metus ultrices, fermentum felis quis, varius velit. Donec ac felis semper, scelerisque diam sed, dignissim risus. Maecenas vel semper sapien. Fusce euismod justo posuere, efficitur risus tincidunt, congue tellus. In hac habitasse platea dictumst. Sed lobortis risus consequat vehicula facilisis.\n\nIn hendrerit, neque in gravida rutrum, purus enim aliquet lectus, sit amet vulputate tortor lacus at sem. Aenean lorem metus, finibus rhoncus eros at, ullamcorper fringilla velit. Nulla vitae porttitor metus, quis gravida lectus. In rhoncus, diam a elementum luctus, erat nisi tempus ex, in porta est.",
                    Uri.parse("https://upload.wikimedia.org/wikipedia/commons/f/fa/Pumpkin_Cream_Soup.jpg"),
                    Uri.parse("https://upload.wikimedia.org/wikipedia/commons/f/fa/Pumpkin_Cream_Soup.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Sausoges",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin vestibulum laoreet odio nec posuere. Quisque ante arcu, malesuada vitae velit a, auctor tincidunt ante. Mauris varius eros eros, eget scelerisque mi scelerisque ut. Donec vehicula vitae urna ac hendrerit. Phasellus egestas risus nec euismod auctor.\n\nInteger fermentum velit et dolor varius sagittis. Proin et viverra sapien. Nulla aliquet ante et hendrerit egestas. Duis vulputate libero in nisi gravida cursus. Praesent laoreet nec dolor non iaculis. Aliquam eleifend ultricies ipsum, eu pellentesque libero rutrum non. Mauris et purus erat. Nullam semper mi id tincidunt viverra. Ut porta sem congue lectus luctus ultricies. Suspendisse iaculis lacinia nibh, eu accumsan magna volutpat vel. Sed id interdum mi, vel sollicitudin elit. Fusce facilisis elementum gravida. Duis at volutpat odio. Integer porta convallis tincidunt. Donec aliquam, leo ut.",
                    Uri.parse("https://upload.wikimedia.org/wikipedia/commons/3/3c/Arabiki_sausages_scrambled_eggs_Chiang_Mai.jpg"),
                    Uri.parse("https://upload.wikimedia.org/wikipedia/commons/3/3c/Arabiki_sausages_scrambled_eggs_Chiang_Mai.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Pancakes",
                    "Lorem iaapsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://upload.wikimedia.org/wikipedia/commons/7/70/Platt_brunch.jpg"),
                    Uri.parse("https://upload.wikimedia.org/wikipedia/commons/7/70/Platt_brunch.jpg"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
        }});

    }};

    /**
     * Creates a list of geofences based on the city locations
     */
    public static List<Geofence> getGeofenceList() {
        List<Geofence> geofenceList = new ArrayList<Geofence>();
        for (String city : CITY_LOCATIONS.keySet()) {
            LatLng cityLatLng = CITY_LOCATIONS.get(city);
            geofenceList.add(new Geofence.Builder()
                    .setCircularRegion(cityLatLng.latitude, cityLatLng.longitude, TRIGGER_RADIUS)
                    .setRequestId(city)
                    .setTransitionTypes(TRIGGER_TRANSITION)
                    .setExpirationDuration(EXPIRATION_DURATION)
                    .build());
        }
        return geofenceList;
    }

    public static String getClosestCity(LatLng curLatLng) {
        if (curLatLng == null) {
            // If location is unknown return test city so some data is shown
            return TEST_CITY;
        }

        double minDistance = 0;
        String closestCity = null;
        for (Map.Entry<String, LatLng> entry: CITY_LOCATIONS.entrySet()) {
            double distance = SphericalUtil.computeDistanceBetween(curLatLng, entry.getValue());
            if (minDistance == 0 || distance < minDistance) {
                minDistance = distance;
                closestCity = entry.getKey();
            }
        }
        return closestCity;
    }
}
