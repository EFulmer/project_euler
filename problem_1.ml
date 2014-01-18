let problem_1 = 
        List.fold (List.filter ~f:(fun x -> x mod 3 = 0 || x mod 5 = 0) (List.range 1 1000)) ~init:0 ~f:(+);;
