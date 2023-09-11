package com.example.practice.state.refactor;

public class OccupiedRoomState implements HotelRoomState {
    HotelRoom hotelRoom;
    public OccupiedRoomState(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    @Override
    public void reserveRoom() {
        System.out.println("이미 체크인 되었습니다.");
    }

    @Override
    public void checkIn() {
        System.out.println("이미 체크인 되었습니다.");
    }

    @Override
    public void checkOut() {
        System.out.println("체크아웃 완료");
        hotelRoom.changeState(new AvailableRoomState(hotelRoom));
    }

    @Override
    public void cancelReservation() {
        System.out.println("이미 체크인 되었습니다. 취소할 수 없습니다.");
    }
}
