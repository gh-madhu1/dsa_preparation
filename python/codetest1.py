# -*- coding: utf-8 -*-
"""
Created on Sun Jun 14 17:12:03 2020

@author: kanukuma
"""

def popularNFeatures(numFeatures,  topFeatures,  possibleFeatures,
             numFeatureRequests,  featureRequests):

    ngramsList = []
    resultList = []
    for featureRequest in featureRequests:
        ngramsList.append( featureRequest.split())
    print(ngramsList)
    for feature in possibleFeatures:
        for ngrams in ngramsList:
            print(feature)
            flag = feature in ngrams
            print(flag)
            if flag ==True:
                resultList.append((feature, ngrams.count(feature)))
    return resultList;


lst = ["abc","cde","def","efg"]
lst2 = ["abc is good then bcd","bcd is bad then cde, def","cde is good then bcd","def is good then all"]
print(popularNFeatures(4, 2, lst, 4, lst2));
