/* 
 * File:    main.c
 * Author:  DHintz
 * Subject: Ad-hoc
 * Level:   1
 * Created on 19 sierpnia 2016, 07:30
 */

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char** argv) {
    int initialNumberOfTabs = 0;
    int numberOfActions = 0;
    int numberOfTabs = 0;
    char action[32]; //fechou or clicou
    scanf("%d %d", &initialNumberOfTabs, &numberOfActions);
    numberOfTabs = initialNumberOfTabs;
    while (numberOfTabs > 0 && numberOfActions-- > 0) {
        scanf("%s", action);
        if (action[0] == 'f') { //closed a tab
            numberOfTabs++;
        } else { //clicked on an ad
            numberOfTabs--;
        }
    }
    printf("%d\n", numberOfTabs);
    return (EXIT_SUCCESS);
}

