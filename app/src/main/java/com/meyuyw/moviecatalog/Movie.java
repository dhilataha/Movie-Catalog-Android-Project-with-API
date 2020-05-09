package com.meyuyw.moviecatalog;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    String title;
    String runtime;
    String release;
    String overview;
    int poster;


    Movie() {
    }

    protected Movie(Parcel in) {
        title = in.readString();
        runtime = in.readString();
        release = in.readString();
        overview = in.readString();
        poster = in.readInt();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public String getTitle() {

        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(runtime);
        dest.writeString(release);
        dest.writeString(overview);
        dest.writeInt(poster);
    }
}
