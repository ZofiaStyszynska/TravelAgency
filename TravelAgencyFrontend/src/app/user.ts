import {Trip} from "./trip/trip";

export class User {
  id: number;
  firstName: string;
  lastName: string;
  email: string;
  address: Address = new Address();
  purchasedTrips: Trip[];


}

export class Address {
  cityName: string;
  streetName: string;
  houseNumber: string;
  postalCode: string;

}

function greeter(user: User): string {
  return 'Konto użytkownika:, ' + user.firstName + " " + user.lastName;
}
